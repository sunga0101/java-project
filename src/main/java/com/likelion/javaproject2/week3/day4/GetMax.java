package com.likelion.javaproject2.week3.day4;

public class GetMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9 ,7};
        int targetValue = 0; // 범위가 자연수니까 굳이 아주 작은 범위 안잡아도 됨

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > targetValue ) {
                targetValue = arr[i];

            }
        }
        System.out.printf("targetValue의 값과 배열의 최대값은 동일합니까? %b", targetValue==31);

    }
}
