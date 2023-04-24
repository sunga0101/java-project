/*
공백 문자가 포함되어 있는 문장을 입력받고 그대로 출력하는 연습을 해보자.
*/
package com.likelion.javaproject2.week2.day1;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1022 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.print(word);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1022 c = new CodeUp1022();
        c.print();
    }
}
