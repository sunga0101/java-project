package com.likelion.javaproject2.week4.day4;

public class User {

    String name;
    String phoneNumber;
    int age;
    long passwrod;
    int birth;

    public User() {}

    public User(String name, String phoneNumber, int age, int birth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneName(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPasswrod(long passwrod) {
        this.passwrod = passwrod;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}





