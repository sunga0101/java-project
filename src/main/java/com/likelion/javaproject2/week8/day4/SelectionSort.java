package com.likelion.javaproject2.week8.day4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arrNum = {36, 12, 18, 15, 41, 19};
        int n = arrNum.length;

        // 제일 작은 원소를 찾아서 맨 앞으로 보낸다
        for (int i = 0; i < n-1; i++) { // i의 값 -> 지금까지 정렬된 원소 개수
            // 제일 앞 원소를 현재 제일 작다고 설정
            int minIdx = i;
            // j(0번부터) <-> j+1(1번~n-1번까지)를 비교
            for (int j = i+1; j < n ; j++) {
                if(arrNum[minIdx] > arrNum[j]){
                    minIdx = j; // 한 바퀴 돌면서 가장 작은 인덱스를 구해서 변경
                }
            }
            int temp = arrNum[minIdx];
            arrNum[minIdx] = arrNum[i]; // 현재 가장 앞자리의 원소값과 변경
            arrNum[i] = temp;
        }
        System.out.println(Arrays.toString(arrNum));
    }
}
