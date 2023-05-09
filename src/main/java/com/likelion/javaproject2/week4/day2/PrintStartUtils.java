package com.likelion.javaproject2.week4.day2;

public class PrintStartUtils {
    public static String makePyramidLine(int height, int i) {
        return String.format("%s%s\n", " ".repeat(height -i-1), "*".repeat(2*i+1));
    }
}
