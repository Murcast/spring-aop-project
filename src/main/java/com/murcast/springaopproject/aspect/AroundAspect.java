package com.murcast.springaopproject.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(5)
@Component
public class AroundAspect {

    @Around("execution(* com.murcast.springaopproject.service.*.getFortune(..))")
    public Object aroundPointcut(ProceedingJoinPoint pjp) {
        System.out.println("\n========>>> METHOD SIGNATURE: " + pjp.getSignature());
        var start = System.currentTimeMillis();
        Object result;
        try {
            result = pjp.proceed();
        } catch (Throwable e) {
            System.out.println("@Around advice: We have a problem: " + e);
            throw new RuntimeException(e);
        }
        var end = System.currentTimeMillis();
        var duration = end - start;
        System.out.println("\n========>>> Duration: " + duration / 1000.0 + " seconds");
        return result;
    }
}
