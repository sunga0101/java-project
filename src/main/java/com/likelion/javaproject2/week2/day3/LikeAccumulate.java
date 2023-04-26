package com.likelion.javaproject2.week2.day3;

public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount = likeCount + 1;
        System.out.println(likeCount); //좋아요 1개만

        likeCount = likeCount + 1;//좋아요 1개 더
        System.out.println(likeCount); //좋아요 1개만

        likeCount = likeCount - 1;//좋아요 1개 취소
        System.out.println(likeCount);
    }
}
