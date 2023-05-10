package com.likelion.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {


    // 생성자를 통해 DI 하게 변경
    Printer printer;
    public RightTrianglePrinter(Printer printer){
        this.printer = printer;
    }


    // 한 줄 포맷 만들기
    public String makeALine(int h, int i){

        return String.format("%s%s\n","","*".repeat(i));
        }

    // 반복 여러줄 모양 포맷 만들기
    public void printShape(int h) throws IOException {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = (makeALine(h,i));
        }
        print(lines); // 호출시마다 파일 생성, 내용이 출력
        printer.print(lines); // 호출시 콘솔에 출력
    }

    // String  출력
    public void print(String[] file) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./triangle.txt"));
        for (int i = 0; i < file.length; i++) {
            bw.append(file[i]);
            bw.flush();
        }
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        RightTrianglePrinter triangle = new RightTrianglePrinter(new ConsolPrinter());
        triangle.printShape(5);
    }

}
