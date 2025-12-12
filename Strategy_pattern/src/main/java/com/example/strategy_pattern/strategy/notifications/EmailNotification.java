package com.example.strategy_pattern.strategy.notifications;

import com.example.strategy_pattern.strategy.NotificationStrategy;

public class EmailNotification implements NotificationStrategy {

    @Override
    public void send(String msg) {
        System.out.println("email 알림: " + msg);
    }
}