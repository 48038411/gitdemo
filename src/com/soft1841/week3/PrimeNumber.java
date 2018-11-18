package com.soft1841.week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("请您输入一个正整数");
        number = scanner.nextInt();
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                break;
            }
        }
        if(i >= number ){
            System.out.println("您输入的"+number+"是素数");
        }else{
            System.out.println("您输入的"+number+"不是素数");
        }
        scanner.close();
    }
}