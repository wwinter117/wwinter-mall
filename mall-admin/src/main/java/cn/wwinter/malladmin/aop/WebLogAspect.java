package cn.wwinter.malladmin.aop;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;

/**
 * ClassName: WebLogAspect
 * Package: cnn.wwinter.malladmin.aop
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
@Component
@Aspect
public class WebLogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebLogAspect.class);

    private final ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * cn.wwinter.malladmin.controller.*.*(..))")
    public void logPoint() {
    }

    @Before("logPoint()")
    public void doBefore(JoinPoint joinPoint) {
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert requestAttributes != null;
        HttpServletRequest request = requestAttributes.getRequest();
        String classMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        LOGGER.info("### [REQUEST]: URL:{}; HTTP_METHOD:{}; IP:{}; CLASS_METHOD:{}; ARGS:{}",
                request.getRequestURL(), request.getMethod(), request.getRemoteAddr(), classMethod, args);
    }

    @AfterReturning(value = "logPoint()", returning = "ret")
    public void doAfterReturning(Object ret) {
        LOGGER.info("### [RESPONSE]: {}; COST_TIME:{}ms", ret, System.currentTimeMillis() - startTime.get());
    }
}
