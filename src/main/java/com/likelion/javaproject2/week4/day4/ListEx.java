package com.likelion.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

/* 리스트 구현 실습 */
public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(0));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        l1.remove(0);
        l1.remove(0);
        System.out.println(l1.isEmpty());

    }
}
