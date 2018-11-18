package com.soft1841.week3;

import java.util.Random;

public class PerfectNum {
    public static void main(String[] args) {
        int i;
        int n;
        System.out.println("1000以内的完全数为");

        for (i = 2; i <= 1000; i++) {
            int sum = 0;
            for (n = 1; n <= i/2; n++) {
                if (i % n == 0) {
                    sum += n;
                }
            }
                if (sum == i) {
                    System.out.println(i + ",");
                }
        }
    }
}