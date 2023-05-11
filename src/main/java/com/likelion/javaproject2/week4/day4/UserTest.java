package com.likelion.javaproject2.week4.day4;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("김민지", "010-1111-1111", 50, 951223);

        user1.setName("홍길동");
        user1.setAge(18);
        user1.setBirth(230501);
        user1.setPasswrod(1039493303);
        user1.setPhoneName("010-0000-0000");

        user1.getName();
        user1.getAge();
        user1.getBirth();
        user1.getPhoneNumber();

        System.out.printf("%s 유저 님은 %d세, 연락처 : %s , 생일 : %d 입니다.\n", user1.getName(), user1.getAge(), user1.getPhoneNumber(), user1.getBirth());
        System.out.printf("%s 유저 님은 %d세, 연락처 : %s , 생일 : %d 입니다.\n", user2.getName(), user2.getAge(), user2.getPhoneNumber(), user2.getBirth());
    }
}
