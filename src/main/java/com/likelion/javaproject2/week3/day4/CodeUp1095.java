/*바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성.*/
package com.likelion.javaproject2.week3.day4;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int minVal = 100000;
        int iVal;
        int iCnt = sc.nextInt();
        for (int i = 0; i < iCnt; i++) {
            iVal = sc.nextInt();
            if (minVal > iVal){
                minVal = iVal;
            }
        }
        System.out.printf("%d",minVal);
    }
}

