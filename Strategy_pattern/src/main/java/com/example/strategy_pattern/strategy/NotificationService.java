package com.example.strategy_pattern.strategy;

public class NotificationService {

    private NotificationStrategy strategy;

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void notify(String msg) {
        strategy.send(msg);
    }



}
