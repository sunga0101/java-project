package com.likelion.javaproject2.week3.day2;

public class WhileNumCount {
    public static void main(String[] args) {
        int num = 0;
        int cnt = 0;
        while (num > 0) {
            num = num/10;
            cnt++;
        }
        System.out.println("cnt = " + cnt);
    }
}
