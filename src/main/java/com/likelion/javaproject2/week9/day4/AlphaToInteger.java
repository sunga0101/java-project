package com.likelion.javaproject2.week9.day4;

public class AlphaToInteger {
    // 숫자로만 이루언진 value 문자열에 대해서
    // 각 글자를 숫자 데이터로 해석한 뒤
    // - 48 하면 숫자가 된다.
    public int atoi(String value) {
        int result = 0;
        int minus = 1;
        // TODO 문자열을 한글자(한 자리)씩 확인
        for (int i = 0; i < value.length() ; i++) {
            if (value.charAt(i) == '-') minus = -1*minus;
            else {
                // TODO 자릿수 변환
                int val = (value.charAt(i) - 48);
                // TODO 글자를 숫자로 변환
                result = result * 10 + val;
            }
        }

        return result*minus;
    }

    public static void main(String[] args) {
        AlphaToInteger atoi = new AlphaToInteger();
        System.out.println(atoi.atoi("12345"));
        System.out.println(atoi.atoi("-4291"));
    }
}