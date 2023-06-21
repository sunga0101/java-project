package com.likelion.javaproject2.week10.day3;

public class TreeTraverse {

    private int nodes;
    private int[] arr; // 이진트리를 표현하기 위한 배열

    //  {0,1,2,3,4,5,6,7,8,9,10,11 }
    public void setArr(int[] arr) {
        this.arr = arr;
        this.nodes = arr.length;
    }

    // 전위순외 V-> L-> R
    // preorder(1);=>   V -> preorder(L) -> preorder(R)

    public void traversePreorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            System.out.print(arr[node] + ", "); // 내 자신 방문
            this.traversePreorder(node * 2); // Left 자식 방문 모두 하고
            this.traversePreorder(node * 2 + 1); // Right 자식 방문
        }
    }


    public void traverseInorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traverseInorder(node * 2);
            System.out.print(node + ", ");
            this.traverseInorder(node * 2 + 1);
        }
    }

    public void traversePostorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traversePostorder(node * 2);
            this.traversePostorder(node * 2 + 1);
            System.out.print(node + ", ");
        }
    }

    public static void main(String[] args) {
        TreeTraverse tree = new TreeTraverse();
        tree.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});

        tree.traversePreorder(1); // 처음 방문점 root node
        System.out.println();
        tree.traverseInorder(1); //  중간 방문점 root node
        System.out.println();
        tree.traversePostorder(1); // 마지막 방문점 root node
    }
}
