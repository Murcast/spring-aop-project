package com.murcast.springaopproject.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(4)
@Component
public class AfterAspect {

    @After("execution(* com.murcast.springaopproject.dao.AccountDAO.findAccounts(..))")
    public void afterPointcut(JoinPoint jp) {
        System.out.println("\n========>>> AFTER METHOD EXECUTED");
    }
}
