package com.jokerkiki.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    @Pointcut("execution(public int com.jokerkiki.demo.dao.DemoDao.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void start(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + ": start");
    }


    @After("pointCut()")
    public void end(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() +" : end");
    }
    @AfterReturning(value = "pointCut()" ,returning = "object")
    public void isReturn(JoinPoint joinPoint ,Object object){
        System.out.println(joinPoint.getSignature().getName() + " object:" +object +" : return");
    }
    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void isException(JoinPoint joinPoint,Exception exception){
        System.out.println(joinPoint.getSignature().getName()+ "exception : "+ exception + " : exception");
    }

}
