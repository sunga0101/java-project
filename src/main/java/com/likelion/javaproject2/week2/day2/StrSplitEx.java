package com.likelion.javaproject2.week2.day2;

public class StrSplitEx {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);
        System.out.println(strArr[5]);
//        System.out.println(strArr[6]); 존재 x
    }
}
