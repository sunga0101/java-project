package com.likelion.javaproject2.week11.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class RecursiveDFS {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer: 입력받은 문자열을 ' ' (또는 지정된 delimiter) 를 기준으로 나누어서
        // 한 단어씩 반환해주는 도구
        StringTokenizer graphTokenizer = new StringTokenizer(reader.readLine());

        int maxNodes = Integer.parseInt(graphTokenizer.nextToken());  // 8
        int edges = Integer.parseInt(graphTokenizer.nextToken());

        int[][] adjMatrix = new int[maxNodes][maxNodes];  // 0 ~ 7 까지 표현 가능한 인접 행렬
        // 간선의 갯수만큼 반복해서 입력을 받는다.
        for (int i = 0; i < edges; i++) {
            // 다음줄을 단어 단위로 나눠주는 Tokenizer
            StringTokenizer edgeTokenizer
                    = new StringTokenizer(reader.readLine());
            // 입력 줄의 첫 숫자
            int startNode = Integer.parseInt(edgeTokenizer.nextToken());
            // 입력 줄의 두번째 숫자
            int endNode = Integer.parseInt(edgeTokenizer.nextToken());
            // 유향 그래프의 경우 아래줄 만
            adjMatrix[startNode][endNode] = 1;
            // 무향 그래프의 경우 아래줄도 함께
            adjMatrix[endNode][startNode] = 1;
        }

//        for (int[] row: adjMatrix) {
//            System.out.println(Arrays.toString(row));
//        }
        boolean[] visited = new boolean[maxNodes];
        List<Integer> visitedOrder = new ArrayList<>();

        recursive(0,maxNodes,adjMatrix,visited,visitedOrder);
        System.out.println(visitedOrder);
    }

    // DFS 했을 때 정점 방문 순서를 기록한다
    public void recursive(
        // 이번 호출에서 방문할 곳
        int next,
        // 원활한 순휘를 위한 maxNodes
        int maxNodes,
        // 인접 정점 정보
        int[][] adjMatrix,
        // 여태까지 방문한 정점 정보
        boolean[] visited,
        // 방문 순서 기록 리스트
        List<Integer> visitOrder
    ){
        visited[next] = true;
        visitOrder.add(next);
        //반복문에서 재귀호출
        for (int i = 0; i < maxNodes; i++) {
            // 연결이 되어있으며 방문한적 없다면
            if (!visited[i] && adjMatrix[next][i]==1)
                recursive(i,maxNodes,adjMatrix,visited,visitOrder);
        }


    }

    public static void main(String[] args) throws IOException {
        new RecursiveDFS().solution();
    }
}
