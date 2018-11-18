package com.soft1841.week3;

import java.util.Random;

public class SimpleVerifyCode {
    public static void main(String[] args) {
        //定义一个空白字符串verifyCode
        String verifyCode = "";
        //定义一个随机数集
        Random random = new Random();
        //定义整型n
        int n;
        for(int i = 1; i<= 4; i++){
            //
            n = random.nextInt(27);
            verifyCode += (char) ('a' + n);
            //verifyCode = verifyCode + (char) ('a' + n );
        }
        System.out.println(verifyCode);
    }
}
