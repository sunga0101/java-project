package com.likelion.javaproject2.week9.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
* 주어진 숫자 순서:  1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
* maxNode: 7
* 조건 :
*   1. 1번 정점에서 출발
*   2. 작은 숫자를 가진 정점부터 방문
*
* */
public class DFS {
    public void solution() throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int maxNode = Integer.parseInt(br.readLine());
        String[] edges = br.readLine().split(" ");
        int[][] edgeMap = new int[maxNode+1][maxNode+1];

        // 데이터 연결 정보 표현하기
        for (int i = 0; i < edges.length/2; i++) {
            int leftNode = Integer.parseInt(edges[i*2]);
            int rightNode = Integer.parseInt(edges[i*2+1]);
            // 양방향 노드 만들기
            edgeMap[leftNode][rightNode] = 1;
            edgeMap[rightNode][leftNode] = 1;
        }

        // 방문할 노드
        Stack<Integer> toVisit = new Stack<>();
        // 방문 기록 체크
        boolean[] visited = new boolean[maxNode+1]; // true:방문함 false:방문안함
        // 노드 방문 순서
        List<Integer> visitedOrder = new ArrayList<>();


        // 첫 방문 대상 (조건대로 1번부터)
        int next = 1;
        toVisit.push(next);

        // 스택이 비어있지 않는 동안 반복
        while (!toVisit.isEmpty()){
            // 다음 방문할 곳 -> 스택의 top
            next = toVisit.pop();
            if (visited[next]){ // 이미 방문했으면 다음 노드 pop하러 감
                continue;
            }
            // 아직 방문 전이면
            visited[next] = true; // 방문 체크
            visitedOrder.add(next);
            count++;// pop할 때 카운트

            // 다음으로 방문할 곳을 탐색
            // next와 인접한 노드 중 방문하지 않은 곳
            // 작은 크기부터 방문하려면 큰 숫자부터 push해야 -> 작은 숫자 먼저 pop되니까 역순으로
            for (int i = maxNode; i > 0 ; i--) { // 1~max 사이니까 0은 포함 x (0행, 0열 사용안함)
                if (edgeMap[next][i]==1 && !visited[i] ){
                    toVisit.push(i);
                }
            }
        }
        System.out.println(visitedOrder);
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        new DFS().solution();
    }
}

