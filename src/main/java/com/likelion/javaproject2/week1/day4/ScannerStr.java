package com.likelion.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerStr {
    public void printStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next()+sc.next());
    }

    public static void main(String[] args) {
        ScannerStr sstr = new ScannerStr();
        sstr.printStr();
    }
}


