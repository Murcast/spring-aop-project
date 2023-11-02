package com.murcast.springaopproject.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TrafficFortuneServiceImpl implements  TrafficFortuneService {

    @Override
    public String getFortune(boolean flag) {

        if (flag) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("default runtime exception message");
        }
        return "Expect heavy traffic this morning";
    }
}
