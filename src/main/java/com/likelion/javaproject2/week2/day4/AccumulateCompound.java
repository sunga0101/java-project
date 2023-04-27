package com.likelion.javaproject2.week2.day4;

public class AccumulateCompound {
    public static void main(String[] args) {
        //first 나머지 구하고
        //second  몫을 구하기

        int num = 678;
        int answer = 0;
        answer += num % 10;
        System.out.println("answer = " + answer);
        num /= 10;

        answer += num % 10;
        System.out.println("answer = " + answer);
        num /= 10;

        answer += num % 10;
        System.out.println("answer = " + answer);

    }
}
