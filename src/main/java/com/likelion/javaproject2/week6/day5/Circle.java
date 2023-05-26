package com.likelion.javaproject2.week6.day5;

public class Circle implements Shape {
    private double radius;
    static final double PI = 3.141592;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }

}
