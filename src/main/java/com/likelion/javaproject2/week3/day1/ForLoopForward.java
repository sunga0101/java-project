package com.likelion.javaproject2.week3.day1;

public class ForLoopForward {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i+=2) {
            System.out.printf("%d ",i); // i=1,3,5,7,9
        }
        System.out.println();
        for (int i = 2; i < 10; i+=2) {
            System.out.printf("%d ",i); // i=2,4,6,8
        }
    }
}
