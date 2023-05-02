package com.likelion.javaproject2.week3.day1;

public class LoopCharToInt {
    public static void main(String[] args) {
        for (int c='a'; c<'z'; c++){
            // char -> int (아스키코드가 숫자값으로)
            System.out.printf("%d\n",c);
        }

        //숫자를 아스키코드로
        int num = 97;
        System.out.printf("%c",num); // 'a'가 출력됨
        System.out.println((char) num); // 'a'가 출력됨

    }
}
