package com.soft1841.week3;

public class StudentNo {
    public static void main(String[] args) throws InterruptedException {
        long i = 1;
        while (i <= 40) {
            if ( i < 10) {
                System.out.println("软件1841班" + i + "号同学学号为180234330" + i);
            } else {
                System.out.println("软件1841班" + i + "号同学学号为18023433" + i);
            }
            Thread.sleep(1000);
            i++;
        }
    }
}
