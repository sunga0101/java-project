package com.likelion.javaproject2.week4.day1;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iCnt=0;
        iCnt= sc.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i* iCnt; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

