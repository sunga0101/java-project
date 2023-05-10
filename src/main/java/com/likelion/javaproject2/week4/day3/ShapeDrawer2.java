package com.likelion.javaproject2.week4.day3;

public abstract class ShapeDrawer2 {

        public void printShape(int h) {
            for (int i = 0; i < h; i++) {
                System.out.printf("%s",makeALine(h, i));
            }
        }

        public abstract String makeALine(int h, int i);
        // 추상 메소드로 만들고
        // 필요한 부분에서 가져다쓰기
         //  return String.format("%s%s\n","0".repeat(h-i), "*".repeat(2*i));

    }
