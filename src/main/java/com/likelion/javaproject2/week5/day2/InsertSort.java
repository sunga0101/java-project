package com.likelion.javaproject2.week5.day2;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        for (int i = 1; i < arr.length; i++) {
            // j가 0까지 빼줍니다.
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d \n", i, j, j - 1);
            }
        }
    }
}
