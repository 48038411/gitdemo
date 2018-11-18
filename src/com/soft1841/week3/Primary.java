package com.soft1841.week3;

import java.util.Scanner;

public class Primary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("请您随机输入一个数字");
        choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("您抽到的奖品为一等奖，奖品为42存彩电");
        }else if(choice == 2){
            System.out.println("您抽到的奖品为二等奖，奖品为光波炉");
        }else if(choice == 3){
            System.out.println("您抽到的奖品为三等奖，奖品为加湿盘");
        }else  if( choice == 4){
            System.out.println("您抽到的奖品为四等奖，奖品为16G-U盘");
        }
    }
}
