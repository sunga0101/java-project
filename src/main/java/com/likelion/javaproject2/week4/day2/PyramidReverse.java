package com.likelion.javaproject2.week4.day2;

/*피라미드 별찍기를 리버스 버전으로 해보자 */
public class PyramidReverse {
    // 메소드로 핵심기능을 분리한다.
    public String makeALine(int h, int i) {
        return String.format("%d, %d\n",i, h+3-(i*2)) ; // 주요코드
    }
    public String makeAStars(int h, int i) {
        return String.format("%s%s\n","0".repeat(i), "*".repeat(h+3-(i*2))) ; // 주요코드
    }

    public static void main(String[] args) {
        PyramidReverse py = new PyramidReverse();
        int h = 4;

        // 기존 로직을 method 호출하도록 변경
        for (int i = 0; i < h; i++) {
            System.out.print(py.makeALine(h,i));
        }
        System.out.println(">> 별로 출력해겠습니다.");
        for (int i = 0; i < h; i++) {
            System.out.print(py.makeAStars(h,i));
        }
    }
}
/*
*      000////  (3,4)
*      00////   (2,4)
*      0////    (1,4)
*      ////     (0,4)
*            h
* ----@@@@@   h-i h
* ---@@@@@   h-i  h
* --@@@@@      h
* -@@@@@       h
* @@@@@        h
*
*
*
*
*
* */