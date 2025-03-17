package com.example.Spring_Boot_Rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type, class-name(including package).method-name,(args)
    @Before("execution(* com.example.Spring_Boot_Rest.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }

    @After("execution(* com.example.Spring_Boot_Rest.service.JobService.*(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.example.Spring_Boot_Rest.service.JobService.*(..))")
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method has some issues " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.Spring_Boot_Rest.service.JobService.*(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method Completed Successfully " + jp.getSignature().getName());
    }

}
