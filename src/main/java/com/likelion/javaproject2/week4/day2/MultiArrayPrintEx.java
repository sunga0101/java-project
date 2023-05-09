package com.likelion.javaproject2.week4.day2;

public class MultiArrayPrintEx {
    public static void printArr(int a[][]) {
        System.out.printf("%d %d %d\n",a[0][0],a[0][1],a[0][2]);
        System.out.printf("%d %d %d\n",a[1][0],a[1][1],a[1][2]);
        System.out.printf("%d %d %d\n",a[2][0],a[2][1],a[2][2]);
        System.out.println("---------------");
    }


    public static void main(String[] args) {
        int[][] iArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        iArray[0][0]=0;
        iArray[1][1]=0;
        iArray[2][2]=0;
        printArr(iArray);


        iArray[0][0]=10;
        iArray[1][1]=10;
        iArray[2][2]=10;
        printArr(iArray);

        iArray[0][0]=20;
        iArray[1][1]=20;
        iArray[2][2]=20;
        printArr(iArray);
    }
}
