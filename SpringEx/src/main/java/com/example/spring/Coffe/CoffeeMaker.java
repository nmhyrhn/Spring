package com.example.spring.Coffe;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoffeeMaker {
    @Autowired
    private CoffeeMachine coffeeMachine;

//    public void setCoffeeMachine(CoffeeMachine coffeeMachine) {
//        this.coffeeMachine = coffeeMachine;
//    }

    @PostConstruct //이 빈이 다 만들어지고, @Autowired로 다 주입된 다음 자동으로 실행되는 메서드
    public void makeCoffee() {
        System.out.println(coffeeMachine.brew());
    }
}
