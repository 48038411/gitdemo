package com.soft1841.week3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入您想获得质因数的正整数：");
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();

        System.out.print(number + "=");
//循环开始，i的初始值要为2，因为2为非质数中最小的质数，不能为1，你输入的数字要求质因数所以他肯定不是质数
        for (int i = 2; i <= number; i++) {
            //当你输入的值与当前执行到的i不相等时，才执行下列代码
            while (number != i) {
                //如果用户输入的数字除当前i的值为0，则证明可以整除，为质因数，输出
                if (number % i == 0) {
                    System.out.print(i + "*");
                    //这个数被输出了，所以除一下，比如就是90/2=45，45/3=15，15/3=5，5/5=1
                    number = number / i;
                } else
                    break;
            }
        }
        System.out.print(number);
    }
}