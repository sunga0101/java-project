package com.likelion.javaproject2.week1.day4;

public class PrintfEx {
    public void print() {
        System.out.printf("%s", "Hello\n");
        System.out.println("bye");
        System.out.printf("%d * %d = %d\n", 2,2,4);
        System.out.println("2 "+"* "+"2 "+"= "+"4 ");

        System.out.printf("%d\n", 4);
        System.out.printf("%02d\n", 4);
        System.out.printf("%02d\n", 11);
        System.out.printf("%d-%02d-%02d", 2023, 4, 20);
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx();
        printfEx.print();
    }
}
