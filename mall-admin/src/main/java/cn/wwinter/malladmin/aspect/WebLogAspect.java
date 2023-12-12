package cn.wwinter.malladmin.aspect;

import cn.wwinter.malladmin.model.domain.WebLog;
import cn.wwinter.malladmin.util.JsonUtils;
import cn.wwinter.malladmin.util.RequestUtils;
import io.swagger.annotations.ApiOperation;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Description: 统一日志捕获
 * @Date: 2023/11/30
 * @Author: zhangdd
 */
@Component
@Aspect
@Order(1)
public class WebLogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebLogAspect.class);

    private final ThreadLocal<Long> START_TIME = new ThreadLocal<>();

    @Pointcut("execution(public * cn.wwinter.malladmin.controller.*.*(..))")
    public void logPoint() {
    }

    @Before("logPoint()")
    public void doBefore(JoinPoint joinPoint) {
        START_TIME.set(System.currentTimeMillis());
    }

    @Around("logPoint()")
    public Object doAround(ProceedingJoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert requestAttributes != null;
        HttpServletRequest request = requestAttributes.getRequest();
        WebLog webLog = new WebLog();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        if (method.isAnnotationPresent(ApiOperation.class)) {
            ApiOperation apiOperation = method.getAnnotation(ApiOperation.class);
            webLog.setDescription(apiOperation.value());
        }
        Object result;
        try {
            // 执行切点方法
            result = joinPoint.proceed();
            webLog.setBasePath(RequestUtils.getBasePath(request));
            webLog.setStartTime(START_TIME.get());
            webLog.setSpendTime((int) (System.currentTimeMillis() - START_TIME.get()));
            webLog.setUri(request.getRequestURI());
            webLog.setUrl(request.getRequestURL().toString());
            webLog.setMethod(request.getMethod());
            webLog.setIp(RequestUtils.getIpAddress(request));
            webLog.setParameter(getParameter(method, joinPoint.getArgs()));
            webLog.setResult(result);
            LOGGER.info("{}", JsonUtils.objectToJson(webLog));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private Object getParameter(Method method, Object[] args) {
        List<Object> argList = new ArrayList<>();
        Parameter[] parameters = method.getParameters();
        for (int i = 0; i < parameters.length; i++) {
            RequestBody requestBody = parameters[i].getAnnotation(RequestBody.class);
            if (requestBody != null) {
                argList.add(args[i]);
            }
            RequestParam requestParam = parameters[i].getAnnotation(RequestParam.class);
            if (requestParam != null) {
                Map<String, Object> map = new HashMap<>();
                String key = parameters[i].getName();
                if (!StringUtils.hasLength(requestParam.value())) {
                    key = requestParam.value();
                }
                map.put(key, args[i]);
                argList.add(map);
            }
        }
        if (argList.isEmpty()) {
            return null;
        } else if (argList.size() == 1) {
            return argList.get(0);
        } else {
            return argList;
        }
    }
}
