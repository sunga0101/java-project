package com.likelion.javaproject2.week2.day2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] strArr = new String[]{"사과", "바나나", "딸기", "포도"};
        int[] iArr1 = new int[3];
        iArr1[0] = 2;
        iArr1[1] = 4;
        iArr1[2] = 7;

        System.out.println(Arrays.toString(iArr1));
        System.out.printf("%s, %s, %s, %s", strArr[0],strArr[1],strArr[2],strArr[3]);
    }
}
