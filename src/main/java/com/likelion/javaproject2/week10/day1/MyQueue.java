package com.likelion.javaproject2.week10.day1;

public class MyQueue {
    private final int size = 4;
    private final int offset = size + 1;
    private final int[] arr = new int[size];
    private int front = 0;
    private int rear = 0;

    public MyQueue() {
    }

    public void enQueue(int x) {
        if (this.isFull()) {
            throw new RuntimeException("queue is full");
        }
        arr[rear] = x;
        rear = (rear + 1) % offset;
    }

    public int deQueue() {
        if (front == rear) {
            throw new RuntimeException("queue is empty");
        }
        int value = arr[front];
        front = (front + 1) % offset;
        return value;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return arr[front + 1];
    }

    public boolean isFull() {
        // front 쪽이 비어있다면?
        return (rear + 1) % offset == front;
    }

    public static void main(String[] args) {
        MyQueue intQueue = new MyQueue();
        intQueue.enQueue(4);
        intQueue.enQueue(2);
        intQueue.enQueue(3);
        intQueue.enQueue(5);
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
    }
}

