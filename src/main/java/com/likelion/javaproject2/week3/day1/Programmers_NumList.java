package com.likelion.javaproject2.week3.day1;

public class Programmers_NumList {
    public static void main() {
        int[] intArray = new int[]{1,2,3,4,5};
        int odd = 0;
        int even = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) { // 홀수
                odd = odd * 10 + intArray[i];
            } else { //짝수
                even = even * 10 + intArray[i];
            }
        }
        System.out.println(odd + even);
    }

}
