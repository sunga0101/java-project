package com.likelion.javaproject2.week4.day1;

import java.util.Scanner;

public class CodeUp1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iCnt = 0;
        iCnt = sc.nextInt();

        for (int i = 0; i < iCnt; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


