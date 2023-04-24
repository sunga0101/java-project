/*
1개의 단어를 입력받아 그대로 출력해보자.
*/
package com.likelion.javaproject2.week2.day1;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1021 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.print(word);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1021 c = new CodeUp1021();
        c.print();
    }
}
