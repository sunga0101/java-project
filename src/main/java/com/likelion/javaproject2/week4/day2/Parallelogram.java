package com.likelion.javaproject2.week4.day2;

public class Parallelogram {

    private String spaceChar = " ";
    public String makeALine(int h, int i) {
        return String.format("%s%s\n",spaceChar.repeat(h-i), "*".repeat(h)) ; // 주요코드
    }
    public void changeBlank(String c) {
        this.spaceChar = c;

    }

    public static void main(String[] args) {
        int h = 4;
        Parallelogram zeroPara = new Parallelogram();
        for (int i = 0; i < h; i++) {
            System.out.print(zeroPara.makeALine(h,i));
        }
        System.out.println();
        // 높이 4인 평행사변형 공백이 " "으로 출력

        String c = "@";
        zeroPara.changeBlank(c);
        for (int i = 0; i < h; i++) {
            System.out.print(zeroPara.makeALine(h,i));
        }
        // 높이 4인 평행사변형 공백이 -> @으로 변경되어 출력

    }
}