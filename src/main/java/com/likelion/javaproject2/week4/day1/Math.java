package com.likelion.javaproject2.week4.day1;

public class Math {


    public int sumOfNum(int num) {
        int sum =  1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    void printSum(int num) {
        System.out.printf("%d 의 약수의 합은 %d입니다\n", num, sumOfNum(num));
    }
}
