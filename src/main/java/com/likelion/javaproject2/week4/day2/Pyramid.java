package com.likelion.javaproject2.week4.day2;

public class Pyramid {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= k-i-1; j++) {
                System.out.print("_");
            }
            for (int j = 0; j <=2*i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            //System.out.printf("%d 는 공백갯수 %d는 별개수 ",k-i-1,2*i );
            //알고리즘 먼저 출력해본 후
        }

    }
}