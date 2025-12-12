package com.example.strategy_pattern.if_else;

public class Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.notify("kakao", "안녕!");
        service.notify("sms", "문자 왔어요!");
        service.notify("insta", "DM 도착!");

    }
}
