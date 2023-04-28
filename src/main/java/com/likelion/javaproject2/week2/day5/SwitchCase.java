package com.likelion.javaproject2.week2.day5;

public class SwitchCase {
    public static void main(String[] args) {
        String day = "월";
        String time = "휴진"; // 기본값 초기화
        switch (day) {
            case "월", "화", "목", "금" : time = "9:00 ~ 18:30"; break;
            case "토": time = "9:00 ~ 13:00"; break;
            case "수", "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s 입니다.", day, time);
    }
}
