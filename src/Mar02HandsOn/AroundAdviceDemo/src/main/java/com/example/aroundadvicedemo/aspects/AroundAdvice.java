package com.example.aroundadvicedemo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AroundAdvice {
    @Around("execution(* com.example.aroundadvicedemo.dao.*.myMethod())")
    public Object getTimeDiff(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long start=System.currentTimeMillis();
        System.out.println("I can see myMethod is trying to execute 😬");
        Object result=proceedingJoinPoint.proceed();
        long stopped=System.currentTimeMillis();
        System.out.println("It executed for: "+(stopped-start)/1000+" seconds >> I am known as Around Advice");
        System.out.println("I can see myMethod has executed 😬");
        System.out.println("My job is over...see you again when you will call myMethod() again 😬");
        return result;

    }



}

