package com.likelion.javaproject2.week2.day4;

public class OrNotEx {
    public static void main(String[] args) {
        int yearOfExp = 8;
        int numOfProj = 12;
        boolean isProm = yearOfExp >  5 || numOfProj > 10;
        System.out.printf("승진여부 :%b\n", isProm);

        int userAge = 31;
        boolean isAdult = userAge > 18;
        System.out.printf("미성년자입니까? :%b", !isAdult);
    }
}
