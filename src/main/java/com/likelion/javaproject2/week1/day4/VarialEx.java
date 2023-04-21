package com.likelion.javaproject2.week1.day4;

import com.likelion.javaproject2.week1.previous.PrintHello;

public class VarialEx {
    public static void main(String[] args) {
        int iVal; // 변수 선언
        iVal = 0; // 최초로 값을 지정. 초기화


        PrintHello printHello; // 변수 선언
        printHello = new PrintHello(); // 인스턴스화, 초기화 한번에.

        System.out.println(iVal);
        printHello.print();
    }
}
