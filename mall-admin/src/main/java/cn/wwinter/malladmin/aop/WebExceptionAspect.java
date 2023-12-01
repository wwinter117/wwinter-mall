package cn.wwinter.malladmin.aop;

import cn.wwinter.malladmin.model.dto.CommonResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import java.util.Objects;

/**
 * ClassName: WebExceptionAspect
 * Package: cn.wwinter.malladmin.aop
 * Description:
 * Datetime: 2023/11/30
 * Author: zhangdd
 */
@Aspect
@Component
@Order(2)
public class WebExceptionAspect {

    @Pointcut("execution(public * cn.wwinter.malladmin.controller.*.*(..))")
    public void exceptionPoint() {
    }

    @Around("exceptionPoint()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof BindingResult bindingResult) {
                if (bindingResult.hasErrors()) {
                    return new CommonResult().validateFailed(bindingResult);
                }
            }
        }
        return joinPoint.proceed();
    }
}
