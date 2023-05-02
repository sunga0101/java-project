package com.likelion.javaproject2.week3.day2;

import java.time.LocalDateTime;

public class WhileEx {
    public static void main(String[] args) throws InterruptedException {
        int cnt = 0;
        // 10 카운트
        while (cnt < 11) {
            System.out.printf("%d ", cnt++);
        }

        // 지금 시간 카운트
        while (true) {
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }

    }
}
