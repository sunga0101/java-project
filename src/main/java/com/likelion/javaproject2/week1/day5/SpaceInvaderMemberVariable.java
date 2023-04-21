package com.likelion.javaproject2.week1.day5;

public class SpaceInvaderMemberVariable {
    int location; // 멤버변수
    public void moveLeft() {
        location = location -1;
        System.out.printf("moveLeft : %d\n", location);
    }

    public void moveRight() {
        location = location +1;
        System.out.printf("moveRight : %d\n", location);

    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable spaceInvaderMemberVariable = new SpaceInvaderMemberVariable();
        spaceInvaderMemberVariable.moveLeft();
        spaceInvaderMemberVariable.moveRight();
        spaceInvaderMemberVariable.moveRight();
        spaceInvaderMemberVariable.moveRight();
        spaceInvaderMemberVariable.moveRight();
        spaceInvaderMemberVariable.moveRight();
        spaceInvaderMemberVariable.moveRight();
        System.out.printf("최종위치: %d", spaceInvaderMemberVariable.location);
    }
}
