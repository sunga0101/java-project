package com.likelion.javaproject2.week2.day5;

public class SwitchCaseDayOfWeek {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        // 월:1 화:2 수:3 목:4 금:5 토:6 일:7

        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
            default:
                System.out.println(dayOfWeek+"에 해당하는 요일은 없습니다.");
        }
    }
}
