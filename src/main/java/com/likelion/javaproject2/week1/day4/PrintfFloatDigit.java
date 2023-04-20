package com.likelion.javaproject2.week1.day4;

import java.util.Scanner;

public class PrintfFloatDigit {
    public void printDigit() {
        System.out.printf("%f\n", 3.149);
        System.out.printf("%.1f\n", 3.149); // 둘째자리 반올림
        System.out.printf("%.2f\n", 3.149); // 셋째자리 반올림
        System.out.printf("%.3f\n", 3.149); // 전체출력
    }

    public void avgDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s","숫자 3개를 입력하세요 :\n");
        System.out.printf("%f",sc.nextFloat() + sc.nextFloat() + sc.nextFloat() / 3.0);
    }

    public static void main(String[] args) {
        PrintfFloatDigit printfFloatDigit = new PrintfFloatDigit();
        printfFloatDigit.printDigit();
        printfFloatDigit.avgDigit();
    }
}
