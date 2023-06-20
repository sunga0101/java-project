package com.likelion.javaproject2.week10.day2;

public class MyLinkedList {
    private Node start;

    private static class Node{
        private int data;
        private Node link;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node link){
            this.data = data;
            this.link = link;
        }
    }


    // add : 제일 뒤에 data 추가
    public void add(int data) { // 원소 없음
        if (start==null) start=new Node(data);
        else { // 원소 있음
            Node head = start;
            while (head.link != null) {
                head = head.link;
            }
            // while문 나온 상황: head의 link가 없을 때 (마지막 노드일 때)
            head.link = new Node(data); // 맨 뒤에 추가
        }
    }

    // idx번째 데이터, 노드를 제거한다
    public int remove(int idx){
        if (idx == 0) {
            int value = start.data;
            start = start.link;
            return value;
        }
        int i = 0; // 몇번 반복했는지 -> N번 반복: N번째 노드 도착
        Node prev = start;
        Node head = start;
        while (i < idx){
            prev = head;
            head = head.link;
            i++;
        }
        // i == idx이면
        prev.link=head.link; // 현재 노드의 링크를 앞 노드의 링크로 연결

        return head.data;
    }

}
