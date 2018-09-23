package com.gorczynskimike.systemtime;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class SystemTimeSolution {

    public void displaySystemTime1() {
        System.out.println("Time since JAN 1970 in millis: " + System.currentTimeMillis());
    }

    public void displaySystemTime2() {
        System.out.println(LocalTime.now());
    }

    public void displaySystemTime3() {
        long millis = System.currentTimeMillis();
        long seconds = millis / 1000;
        LocalDateTime now = LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.systemDefault().getRules().getOffset(Instant.now()));
        System.out.println(now.toString().replaceAll("[^T]*T", ""));
    }

}
