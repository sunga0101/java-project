package com.likelion.javaproject2.week2.day3;

public class MinuteSecond {
    public static void main(String[] args) {
        int seconds = 239;
        int minute = seconds / 60 ;
        int second = seconds % 60 ;
        System.out.printf("%d분 %d초", minute, second);
    }
}
