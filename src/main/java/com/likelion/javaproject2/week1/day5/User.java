package com.likelion.javaproject2.week1.day5;

public class User {
    String name;
    String phoneNumber;
    int age;

    boolean isAdult() {
        return age >= 20;
    }

    public static void main(String[] args) {
        //user1
        User user1 = new User();
        user1.name = "홍길동";
        user1.phoneNumber = "010-1234-1234";
        user1.age = 30;
        System.out.printf("%s은(는) 성인입니까? %s\n", user1.name, user1.isAdult());

        //user2
        User user2 = new User();
        user2.name = "김개똥";
        user2.phoneNumber = "010-3000-5000";
        user2.age = 15;
        System.out.printf("%s은(는) 성인입니까? %s\n", user2.name, user2.isAdult());
    }
}
