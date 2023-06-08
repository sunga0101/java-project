package com.likelion.javaproject2.week8.day4;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arrNum = {36, 12, 18, 15, 41, 19};
        int n = arrNum.length;

        /* 첫번째 원소와 인접환 원소를 비교
         * 두번째 원소와 세번째 원소를 비교
         * ...
         * n-1번째 원소와 n번째 원소를 비교
         * */
        for (int i = 0; i < n - 1; i++) { // 몇번 반복할 것인지? 반복 횟수를 나타내는 인자
            for (int j = 0; j < n - 1 - i; j++) { // 비교할 때 i개의 확정된 원소 빼고 0번~(n-1)-i번까지 비교 =>  n-1과 n번비교까지
                if (arrNum[j] > arrNum[j + 1]) { // n-1번째 반복루틴에서 [n-1] 원소와 [(n-1)+1] 원소를 비교함
                    int temp = arrNum[j];
                    arrNum[j] = arrNum[j + 1];
                    arrNum[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arrNum));
    }
}

