package com.example.spring.Calculator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect //AoP 기능 알려줌
public class PrintExecutionTimeAspect {
    @Around("@annotation(com.example.spring.Calculator.PrintExecutionTime)")
        //메서드 감싸줌
    public Object printExecutiontime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        var object = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println("executed " +joinPoint.toShortString()+
                " with " +joinPoint.getArgs().length +
                " args in "+executionTime+" ms");
        return object;
    }
}
