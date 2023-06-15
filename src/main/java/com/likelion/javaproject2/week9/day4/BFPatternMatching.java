package com.likelion.javaproject2.week9.day4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BFPatternMatching {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = br.readLine(); // 주어진 문자열
        String pattern = br.readLine(); // 찾아야하는 단어나 문자패턴

        int targetIdx = 0;
        int patternIdx = 0;

        List<Integer> foundAt = new ArrayList<>();
        while (targetIdx < target.length() && patternIdx < pattern.length()) {
            if (target.charAt(targetIdx) != pattern.charAt(patternIdx)){
                targetIdx = targetIdx-patternIdx; //
                patternIdx = -1;
            }
            // next index
            targetIdx+=1; // 일치하면? i = i-j+1     i-j부터 탐색했는데 실패했으니 i-j+1부터(이번 테스트 시작한 곳 다음칸) 다시 하는 것.
                            // (이때 j는 이번 테스트 시작~지금까지 지나온 칸 수)
            patternIdx+=1; // 일치하면 한칸 다음으로,   실패하면 j는 0부터 다시 찾음
            if(patternIdx == pattern.length()){
                foundAt.add(targetIdx-patternIdx); // 몇번째 인덱스에서 일치 시작했는지 저장
                // 그 다음칸부터 다시 검사 시작
                targetIdx = targetIdx - patternIdx + 1;
                patternIdx = 0;
            }
        }

        if (foundAt.size() == 0)
            System.out.println("404 NOT FOUND");
        else foundAt.forEach(System.out::println);


    }

    public static void main(String[] args) throws IOException {
       new BFPatternMatching().solution();
    }
}
