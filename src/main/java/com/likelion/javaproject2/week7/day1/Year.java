package com.likelion.javaproject2.week7.day1;

public class Year {
    public static void checkLeap(){
        int a = 2020;
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("O");
        } else if (a % 400 == 0) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }
    }


    public static void main(String[] args) {
        checkLeap();
    }
}
