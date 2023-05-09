package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

/*
 * 바위 0
 * 가위 1
 * 보 2
 * 입력 : 광현-컴퓨터 순서, 출력은 광현이의 승패결과로
 *
 * win : (0 1), (1 2) (2 0)
 * tie : (0 0), (1 1) (2 2)
 * lose : (0 2), (1 0) (2 1)
 * */
public class CodeUp1671 {
    public String game(int iUser, int iCom) {
        if (iUser == iCom)
            return "tie";
        else if (iUser == 0 && iCom == 1) {
            return "win";
        } else if (iUser == 1 && iCom == 2) {
            return "win";
        } else if (iUser == 2 && iCom == 0) {
            return "win";
        } else {
            return "lose";
        }
    }

    public static void main(String[] args) {
        CodeUp1671 cd = new CodeUp1671();
        Scanner sc = new Scanner(System.in);
        System.out.println(cd.game(sc.nextInt(),sc.nextInt()));
    }
}