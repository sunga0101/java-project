package com.likelion.javaproject2.week2.day3;

public class RemainderSum {
    public static void main(String[] args) {

        int num = 678;
        int firstRemainder = num % 10; // 8
        num = num / 10; //67
        int secondRemainder = num % 10; //7
        num = num / 10; //6
        int thirdRemainder = num % 10; //6

        System.out.println(firstRemainder + secondRemainder + thirdRemainder); //6+7+8
    }
}
