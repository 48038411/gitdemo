package com.soft1841.week3;

import java.util.Scanner;
public class Atm {
    public static void main(String[] args) throws InterruptedException {
        //定义总金额
        int total = 1000;
        System.out.println("欢迎来到ATM取款机");
        System.out.println("请插入银行卡");
        Thread.sleep(2000);
        //定义一个用来接收用户输入的变量
        int choice;
        //定义一个系统输入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("*************");
            System.out.println("1.取款");
            System.out.println("2.存款");
            System.out.println("3.查询余额");
            System.out.println("4.退出");
            System.out.println("*************");
            //接收一个整数1 2 3 4
            System.out.println("请选择你要的操作：");
            choice = scanner.nextInt();
            if (choice == 1) {
                //用户输入取款金额
                while (true) {
                    System.out.println("请输入取款金额");
                    int withdraw = scanner.nextInt();
                    if (withdraw % 100 != 0) {
                        System.out.println("您取款的金额最少为100元，请重新输入");
                    } else if (withdraw <= 1000) {
                        total = total - withdraw;
                        System.out.println("取了" + withdraw + "元，当前余额为：" + total);
                        break;
                    } else {
                        System.out.println("余额不足！");
                    }
                }
            }
                    if (choice == 2) {
                        while (true) {
                            System.out.println("请输入存款金额");
                            int deposit = scanner.nextInt();
                            total = total + deposit;
                            if (deposit % 100 != 0) {
                                System.out.println("您存款的金额应该为100元或者多张100，请重新输入");
                            }else{
                                System.out.println("存了" + deposit + "元,当前余额为"+total);
                                break;
                            }


                        }
                    }
                            if (choice == 3) {
                                System.out.println("当前余额是：" + total);
                            }
                            if (choice == 4) {
                                //跳出循环
                                break;
                            }
                        }
                }
            }