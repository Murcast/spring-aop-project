package com.murcast.springaopproject.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class CloudLoggingAspect {

    @Before("com.murcast.springaopproject.aspect.BaseAspects.forDaoPackageNoGetterSetter()")
    public void cloudLogging(){
        System.out.println("\n========>>> Performing cloud logging");
    }
}
