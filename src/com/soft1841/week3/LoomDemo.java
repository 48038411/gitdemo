package com.soft1841.week3;

import java.util.Scanner;

public class LoomDemo {
    public static void main(String[] args) throws InterruptedException {
        //循环变量初始化
        Scanner scanner = new Scanner(System.in);
        int i;
        int e;
        //求和变量初始化
        System.out.println("欢迎进入累加求和系统");
        Thread.sleep(3000);
        System.out.println("请输入您想计算的初始数字");
        i = scanner.nextInt();
        System.out.println("请输入您想计算的末尾数字");
        e = scanner.nextInt();
        int sum = 0;
        //循环条件
        while(i <= e){  //循环体
            //累加求和
            sum = sum + i;
            i++;
        }
        System.out.println("sum =" + sum);
    }
}
