package com.likelion.javaproject2.week1.day5;

public class SpaceInvader2 {
    private void moveLeft() {
        int location = 0;
        location = -1;
        System.out.printf("moveLeft : %d\n", location);
    }
    private void moveRight() {
        int location = 0;
        location = 1;
        System.out.printf("moveRight : %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvader2 spaceInvader2 = new SpaceInvader2();
        spaceInvader2.moveLeft();
        spaceInvader2.moveRight();
        spaceInvader2.moveRight();
        spaceInvader2.moveRight();
        spaceInvader2.moveRight();
        spaceInvader2.moveRight();
    }
}
