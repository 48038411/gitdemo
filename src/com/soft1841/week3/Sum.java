package com.soft1841.week3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int bothNum = 0;
        System.out.println("请输入一个数字");
        int num;
        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
                bothNum = num * (int)Math.pow(10,i)+ bothNum;
                sum += bothNum;
        }
        System.out.println("求出的和为" + sum);
    }
}