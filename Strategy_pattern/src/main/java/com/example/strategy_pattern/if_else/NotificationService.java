package com.example.strategy_pattern.if_else;

public class NotificationService {

    public void notify (String type, String msg) {

        if(type.equals("kakao")) {
            System.out.println("kakao 알림 : " + msg);
        } else if (type.equals("sms")) {
            System.out.println("sms 알림 : " + msg);
        } else if (type.equals("insta")) {
            System.out.println("insta 알림 : " + msg);
        } else {
            throw new IllegalArgumentException("지원하지 않는 알림 방식입니다");
        }
    }
}
