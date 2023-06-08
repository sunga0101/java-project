package com.likelion.javaproject2.week8.day4;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 3, 0, 5, 2, 5, 1};
        int n = arr.length;

        // 최대 최소는 구했다고 가정함
        int max = 5;
        int min = 0;
        int k = max+1-min; //k는 min~max까지의 배열

        //자료가 몇 번 등장했는지 count하는 배열
        int[] counts = new int[k];

        //counts 채우기
        for (int data: arr){
            counts[data]++;
        }

        //counts 누적합
        for (int i = 0; i < k - 1; i++) {
            counts[i+1] += counts[i];
        }

        // 결과출력용 배열 output
        int[] output = new int[n];
        for (int i = n-1; i >= 0; i--) {
            output[--counts[arr[i]]]= arr[i];
        }

        System.out.println(Arrays.toString(output));
    }
}
