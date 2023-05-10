package com.likelion.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ConsolPrinter implements Printer {
    // 콘솔에 출력되는 print
    @Override
    public void print(String[] file) throws IOException {
        for (int i = 0; i < file.length; i++) {
            System.out.print(file[i]);
        }
    }
}
