package com.likelion.javaproject2.week3.day3;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        while (num > 0) {
            int reminder = num % 10;
            if (reminder % 5 != 0) { // 5로 나눠진다 -> 끝자리가 0이 된다는 조건은 함께 충족
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 2530;
        int num2 = 550;
        int num3 = 0;
        int num4 = 245;
        System.out.printf("%d는 0과 5로만 이루어졌나요? %b\n", num1, isZeroOrFive(num1));
        System.out.printf("%d는 0과 5로만 이루어졌나요? %b\n", num2, isZeroOrFive(num2));
        System.out.printf("%d는 0과 5로만 이루어졌나요? %b\n", num3, isZeroOrFive(num3));
        System.out.printf("%d는 0과 5로만 이루어졌나요? %b\n", num4, isZeroOrFive(num4));
    }
}
