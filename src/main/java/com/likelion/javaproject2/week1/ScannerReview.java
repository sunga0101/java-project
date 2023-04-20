package com.likelion.javaproject2.week1;

import java.util.Scanner;

public class ScannerReview {

    public void TwoNumPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() + sc.nextInt());
    }

    public static void main(String[] args) {
        ScannerReview se = new ScannerReview();
        se.TwoNumPlus();
    }
}