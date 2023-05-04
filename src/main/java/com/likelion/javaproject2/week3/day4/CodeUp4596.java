/*<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성*/
package com.likelion.javaproject2.week3.day4;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp4596 {

    public static void main(String[] args) throws IOException {
        int maxValue = 0;
        int iTarget;
        int posX=0;
        int posY = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                iTarget = sc.nextInt();
                if (maxValue < iTarget) {
                    maxValue = iTarget;
                    posX = i;
                    posY = j;
                }
            }
        }
        System.out.printf("%d\n%d %d", maxValue, posX, posY);
    }
}