package com.likelion.javaproject2.week4.day3;

public class RightTrialgleDraw extends ShapeDrawer2{
    @Override
    public String makeALine(int h, int i) {
          return String.format("%s%s\n", "", "*".repeat(i));
    }

    public static void main(String[] args){
        ShapeDrawer2 rightTri = new RightTrialgleDraw();
        rightTri.printShape(5);
    }
}
