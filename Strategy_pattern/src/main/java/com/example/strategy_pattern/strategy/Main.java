package com.example.strategy_pattern.strategy;

import com.example.strategy_pattern.strategy.notifications.EmailNotification;
import com.example.strategy_pattern.strategy.notifications.KakaoNotification;
import com.example.strategy_pattern.strategy.notifications.SMSNotification;

public class Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        // Kakao 전략 사용
        service.setStrategy(new KakaoNotification());
        service.notify("카카오에서 알림을 보냅니다!");

        // SMS 전략 사용
        service.setStrategy(new SMSNotification());
        service.notify("문자에서 알림을 보냅니다!");

        // Email 전략 사용
        service.setStrategy(new EmailNotification());
        service.notify("이메일에서 알림을 보냅니다");
    }
}
