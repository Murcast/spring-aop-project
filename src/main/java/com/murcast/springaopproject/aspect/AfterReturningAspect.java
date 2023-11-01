package com.murcast.springaopproject.aspect;

import com.murcast.springaopproject.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Order(2)
@Component
public class AfterReturningAspect {

    @AfterReturning(
            pointcut = "execution(* com.murcast.springaopproject.dao.AccountDAO.findAccounts(..))",
            returning = "result"
    )
    public void afterReturningPointcut(JoinPoint theJoinPoint, List<Account> result) {
        System.out.println("\n========>>> Performing AfterReturning execution");
        System.out.println("Original list: " + result.toString());
        result.get(1).setName(result.get(1).getName().toUpperCase());
        System.out.println("Resulting list: " + result);
    }
}
