package com.likelion.javaproject2.week7.day1;

public class Prime {
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false; // i는 n의 약수이다
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
    }
}
