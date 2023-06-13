package com.likelion.javaproject2.week9.day2;

import java.io.*;
import java.util.Stack;

public class PostfixCalculation {
    // input : 531*+49-3*+
    // output : -7
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int numLeft, numRight, result = 0;
        Stack<Integer> digitStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char token = s.charAt(i);

            // TODO 1. 숫자라면 스택에 push
            if (Character.isDigit(token)) { // 숫자가 표현된 글자인지 판단하는 메소드
                digitStack.push(token-'0'); // 토큰을 int로 변환
            }
            // TODO 2. 숫자가 아니라면 두번 pop하고 계산
            else {
                numRight = digitStack.pop();
                numLeft = digitStack.pop();
                switch (token){
                    case '+': result = numLeft+numRight;
                    break;
                    case '-':result = numLeft-numRight;
                        break;
                    case '*':result = numLeft*numRight;
                        break;
                    case '/':result = numLeft/numRight;
                        break;
                    default:
                        throw new IllegalArgumentException("invalid operator");
                }
                digitStack.push(result);
            }
        }
        bw.write(digitStack.pop());
        bw.flush();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        new PostfixCalculation().solution();
    }
}
