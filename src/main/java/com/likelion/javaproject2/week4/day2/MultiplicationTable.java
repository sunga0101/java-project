package com.likelion.javaproject2.week4.day2;

public class MultiplicationTable {
    private  String symbol;

    public MultiplicationTable(String symbol) {
        this.symbol =symbol;
    }
    public  void printDan(int n) {
        for (int i = 1; i < 10 ; i++) {
            System.out.printf("%d %s %d = %d\n", n, symbol ,i ,i*n);

        }
    }

    public static void main(String[] args) {
        MultiplicationTable danTwo = new MultiplicationTable("*");
        danTwo.printDan(2);

    }
}
