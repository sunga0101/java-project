package com.likelion.javaproject2.week5.day3;

import java.util.Stack;

public class Stack1 {

    int[] arr = new int[10000];
    int pointer = 0;

    public void push(int value){
        arr[pointer++] = value;
    }

    public int pop() {
        return this.arr[--pointer];
    }

    public int peek() {
        return arr[pointer-1];
    }

    public boolean isEmpty() {
        return pointer==0;
    }


    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(100);
        stack1.pop();
        stack1.isEmpty();

    }
}
