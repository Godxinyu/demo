package com.lxinyu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by PC-Lxinyu on 2018/8/31.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(public * com.lxinyu.controller.*.*(..))")
    public void controllerLog(){}

    @Before("controllerLog()")
    public void beforeLog(JoinPoint joinPoint){
        System.out.println("开始执行方法： "+ joinPoint.getSignature().getName());
    }

    @AfterReturning("controllerLog()")
    public void afterReturnLog(JoinPoint joinPoint){
        System.out.println("方法"+ joinPoint.getSignature().getName()+ "执行成功");
    }

    @AfterThrowing("controllerLog()")
    public void afterThrowingLog(JoinPoint joinPoint){
        System.out.println("方法"+ joinPoint.getSignature().getName() + "执行失败抛出异常");
    }

}
