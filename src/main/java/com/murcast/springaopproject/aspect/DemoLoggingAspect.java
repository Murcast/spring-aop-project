package com.murcast.springaopproject.aspect;

import com.murcast.springaopproject.dto.DataToPass;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class DemoLoggingAspect {

    @Before("com.murcast.springaopproject.aspect.BaseAspects.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
        System.out.println("\n========>>> Executing @Before advice on method");
        System.out.println("Signature: " + theJoinPoint.getSignature());
        for (Object o : theJoinPoint.getArgs()) {
            if (o instanceof DataToPass data) {
                System.out.println("Title: " + data.getTitle());
                System.out.println("Size: " + data.getSize());
            }
        }
    }
}
