package com.example.spring.Coffe;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dripCoffeeMachine")//어노테이션에 파라미터로 이름을 지정하면 스프링 컨테이너에 등록될 떄 해당이름으로 등록됨
@Primary //의존성 주입시 우선순위 높임
public class DripCoffeeMachine implements CoffeeMachine {
    @Override
    public String brew() {
        return "Brewing coffee with Drip Coffee Machine";
    }
}
