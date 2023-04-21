/*
int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
*/
package com.likelion.javaproject2.week1.day5;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1018 {
    public void print() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.printf("%s ",s);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1018 c = new CodeUp1018();
        c.print();
    }
}