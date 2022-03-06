package com.example.aroundadvicedemo.dao;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class MyService {
    public String myMethod() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (MyService.class + " inside myMethod()");
    }
}
