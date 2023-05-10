package com.likelion.javaproject2.week4.day3;

import java.io.IOException;

/*
* 목적
*
* 1. 파일에도 저장하고 싶고
* 2. 콘솔에도 출력하고 싶다
*
* */
public class HelloPrinter {

    Printer2 printer;

    public HelloPrinter(Printer2 printer){
        this.printer = printer;
    }

    public void print(String message){
        System.out.println(message);
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hpConsole = new HelloPrinter(new ConsolePrinter()); // 인스턴스 생성
        HelloPrinter hpfile2 = new HelloPrinter(new FilePrinter()); // 인스턴스 생성
        // 이후 호출만
        int n = 3;
        hpConsole.repeatMessage(n,"console"); // 콘솔로 출력
        hpfile2.repeatMessage(n,"file"); // filename과 내용으로 출력

    }
}
