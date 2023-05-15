package com.likelion.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleRevers {

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j]; // 제일 작은 숫자를 제일 앞으로
                    arr[j] = temp;
                    System.out.printf("현재 i:%d, j:%d\n", i, j);
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleRevers bubble = new BubbleRevers();
        int[] arr = {7, 2, 3, 9, 28, 44, 1, 5};

        arr = bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}