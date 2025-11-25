package com.example.spring.Calculator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
//애노테이션이 어디에 붙을 수 있는지 지금은 메소드
@Retention(RetentionPolicy.RUNTIME)
//이 애노테이션이 언제까지 유지될지 지금은 실행 중 메서드에서 애노테이션을 감지하고 처리
public @interface PrintExecutionTime {
}
