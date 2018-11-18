package com.soft1841.week3;

        import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        final int count = 10;
        int n;
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for( int i = 0; i< 10; i++){
            System.out.println("Please input a number");
            n = scanner.nextInt();
            if(n > max){
                max = n;
            }

        }
        System.out.println(max);

    }
}
