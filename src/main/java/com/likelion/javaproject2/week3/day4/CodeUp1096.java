/*바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성.*/
package com.likelion.javaproject2.week3.day4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int stoneCnt = sc.nextInt();
        int posX = 0;
        int posY = 0;
        int[][] stone = new int[19][19];

        for (int i = 0; i < 19; i++) {
            Arrays.fill(stone[i], 0);
        }
        for (int i = 0; i < stoneCnt; i++) {
            posX = sc.nextInt()-1;
            posY = sc.nextInt()-1;
            stone[posX][posY]=1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ",stone[i][j]);
            }
            System.out.print("\n");
        }
    }
}