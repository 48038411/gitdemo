package com.soft1841.week3;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people;
        System.out.println("请输入您此次前来的人数");
        people = scanner.nextInt();
        if(people <= 4){
            System.out.println("请您进入四人包间用餐");
        }else if(people >4 && people <= 8){
            System.out.println("请您进入八人包间用餐");
        }else if(people >8 && people <= 16){
            System.out.println("请您进入十六人大包间用餐");
        }else if(people > 16){
            System.out.println("本店暂时没有这么大的包间");
        }
    }
}
