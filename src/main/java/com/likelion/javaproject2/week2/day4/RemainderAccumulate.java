package com.likelion.javaproject2.week2.day4;

public class RemainderAccumulate {
    public static void main(String[] args) {
        int num = 678;

        int answer = 0;
        answer = answer + num % 10;
        System.out.println("answer = " + answer); // 8출력
        num = num / 10;

        answer = answer + num % 10;
        System.out.println("answer = " + answer);// 7출력
        num = num / 10;


        answer = answer + num % 10;
        System.out.println("answer = " + answer);// 6출력

    }
}
