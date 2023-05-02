package com.likelion.javaproject2.week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        // n! while 반복문
        int answer = 1;
        int num = 3;
        while (num >1) { // 조건을 num > 0 으로 하면 마지막 결과가 두번 출력됨
            answer *= num--;
            System.out.println(answer);
        }
    }
}
