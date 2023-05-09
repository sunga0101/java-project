package com.likelion.javaproject2.week4.day2;

public class AbstractTest {
    private ShapeDrawer shapeDrawer;
    private PyramidShapeDrawer pyramidShapeDrawer;

    public AbstractTest(ShapeDrawer shapeDrawer){
        this.shapeDrawer = shapeDrawer;
    }

    public void doTest() {
        shapeDrawer.printShape(5);
    }


    public static void main(String[] args) {
        AbstractTest ab = new AbstractTest(new PyramidShapeDrawer());
        ab.doTest();
        // Pyramid의 makeALine()
        // ShapeDraw의 printShape()
        // Abstract의 doTest()
    }
}
