package com.likelion.javaproject2.week7.day2.model;

public class Person {

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // DTO
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        //return super.toString();// 키 번호만 return하는 기본적인 메소드
        return String.format("%,03d %s",id,name); // 이렇게 리턴하도록 변경
    }
}
