package com.likelion.javaproject2.week7.day1;

public class Clap369 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int val = i/10;
            int extra = i%10;
            System.out.printf("%02d",i);
            if(val == 3 || val == 6 || val == 9)System.out.printf("*");
            if (extra == 3 || extra == 6 || extra == 9) System.out.printf("*");
            System.out.printf("\n");
        }
    }
}
