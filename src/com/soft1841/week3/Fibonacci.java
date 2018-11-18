package com.soft1841.week3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您确定您要输出前几位数以内的斐波那契数列");
        int n;
        n = scanner.nextInt();
        int one = 0;
        int two = 1;
        System.out.println("斐波那契数列的前十项为");
        System.out.print(+one+ "  "+two);
        int three;
        int sum = one + two;
        //定义一个循环变量
        for(int i = 2; i <= n; i ++){
          //计算出第三项
            three = one + two;
            System.out.print("   "+three);
            //挪动one和two
            one = two;
            two = three;
            sum+= three;
        }
        System.out.println("前"+n+"项和为" +sum);

    }
}
