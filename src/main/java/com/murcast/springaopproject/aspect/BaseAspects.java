package com.murcast.springaopproject.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class BaseAspects {

    @Pointcut("execution(* com.murcast.springaopproject.dao.*.*(..))")
    void forDaoPackage(){}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    void forDaoPackageNoGetterSetter(){}

    @Pointcut("execution(* com.murcast.springaopproject.dao.*.get*(..))")
    void getter(){}

    @Pointcut("execution(* com.murcast.springaopproject.dao.*.set*(..))")
    void setter(){}

}
