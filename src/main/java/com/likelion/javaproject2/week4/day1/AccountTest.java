package com.likelion.javaproject2.week4.day1;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.isSufficient();
        if (isSufficient) {
            System.out.println("예산 충분");
        }
        else {
            System.out.println("예산 부족");
        }
    }
}
