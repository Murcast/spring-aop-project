package com.murcast.springaopproject.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class AfterThrowingAspect {

    @AfterThrowing(
            value = "execution(* com.murcast.springaopproject.dao.AccountDAO.findAccounts(..))",
            throwing = "exc"
    )
    public void afterReturningAdvice(JoinPoint joinPoint, Throwable exc) {
        System.out.println("\n========>>> After Throwing exception: " + exc.toString());
    }
}
