package com.soft1841.week3;

import java.util.Scanner;

public class NumGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 147;
        int guess;
        System.out.println("请输入您猜测的正确答案");
        guess = scanner.nextInt();
        while (guess != answer) {
            System.out.print("您猜测的答案错误，");
            System.out.println("请重新猜测正确答案");
            guess = scanner.nextInt();
            if (guess == answer) {
                System.out.println("您猜测的答案正确");
                break;
            }
        }
    }
}
