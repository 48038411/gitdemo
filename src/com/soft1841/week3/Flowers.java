package com.soft1841.week3;

public class Flowers {
    public static void main(String[] args) {
        //水仙花数是三位数，所以区间是从100-999
        int start = 100;
        int hundred;
        int ten;
        int digit;
        //下面括号里面的是右面的区间，为开区间
        while(start < 999){
            hundred = start / 100;
            ten = start / 10 % 10;
            digit = start % 10;

            if(hundred * hundred * hundred + ten * ten * ten + digit * digit * digit == start){
                System.out.println("水仙花数为" +start);

            }
            start++;
        }
    }
}
