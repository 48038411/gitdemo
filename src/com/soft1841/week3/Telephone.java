package com.soft1841.week3;

import java.util.Scanner;

public class Telephone {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long telephone;
        System.out.println("请输入您的手机号码");
        telephone = scanner.nextLong();
        final double tele = 18888888883l;
        if( telephone != tele){
            System.out.println("您输入的手机号码错误");
        }else{
            System.out.println("输入正确");
        }

    }
}
