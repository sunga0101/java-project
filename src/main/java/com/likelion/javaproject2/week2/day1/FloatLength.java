package com.likelion.javaproject2.week2.day1;

public class FloatLength {
    public static void main(String[] args) {
        float f1 = 3.1415921f; // 소수점 아래 6자리 ~ 10자리 이하
        float f2 = 1.23e10f;

        double d1 = 3.141592653589793;
        double d2 = 1.23e100;

        float result1 = f1 * 2.0f;
        double result2 = d1 / 2.0;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
