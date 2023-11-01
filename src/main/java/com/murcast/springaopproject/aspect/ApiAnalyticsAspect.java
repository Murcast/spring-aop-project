package com.murcast.springaopproject.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(3)
@Component
public class ApiAnalyticsAspect {

    @Before("com.murcast.springaopproject.aspect.BaseAspects.forDaoPackageNoGetterSetter()")
    public void performApiAnalytics(){
        System.out.println("\n========>>> Performing API analytics");
    }
}
