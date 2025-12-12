package com.example.strategy_pattern.strategy.notifications;

import com.example.strategy_pattern.strategy.NotificationStrategy;

public class KakaoNotification implements NotificationStrategy {

    @Override
    public void send(String msg) {
        System.out.println("kakao 알림: " + msg);
    }
}