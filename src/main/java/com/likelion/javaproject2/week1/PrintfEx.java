package com.likelion.javaproject2.week1;

public class PrintfEx {
    public void print() {
        System.out.printf("%s", "Hello\n");
        System.out.println("bye");
        System.out.printf("%d * %d = %d\n", 2,2,4);
        System.out.println("2 "+"* "+"2 "+"= "+"4 ");
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx();
        printfEx.print();
    }
}
