/*
실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다
*/
package com.likelion.javaproject2.week2.day1;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1023 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String  str = scanner.next();
        String[] strArr = str.split("\\.");

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1023 c = new CodeUp1023();
        c.print();
    }
}
