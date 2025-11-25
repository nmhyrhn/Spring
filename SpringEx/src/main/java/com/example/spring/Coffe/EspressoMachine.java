package com.example.spring.Coffe;

import org.springframework.stereotype.Component;

@Component
public class EspressoMachine implements CoffeeMachine{
    @Override
    public String brew() {
        return "Brewing coffee with Espresso Machine";
    }
}
