package com.likelion.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {

    List<String> list2 = new ArrayList<>();
    list2.add("hello");
    list2.add("world");

        for (String s: list2
             ) {
            System.out.println(s);

        }

    }
}
