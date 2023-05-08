package com.likelion.javaproject2.week4.day1;

import java.util.Scanner;

public class StarPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iCnt = 0;
        iCnt = sc.nextInt();

        for (int i = 0; i < iCnt; i++) {
            for (int j = iCnt-i; j > 1; j--) {
            System.out.print(" ");
        }
            for (int j = 0; j < iCnt; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

