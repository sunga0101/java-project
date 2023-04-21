package com.likelion.javaproject2.week1.previous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트

        System.out.println("line1 = "+ br.readLine());
        System.out.println("line2 = "+ br.readLine()); // 두줄 입력하기
    }

    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println(br.read()+ br.read());
    }
}
