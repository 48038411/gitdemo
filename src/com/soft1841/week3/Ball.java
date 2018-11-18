package com.soft1841.week3;

public class Ball {
    public static void main(String[] args) {
        double height = 80.0;
        int sum = 80;
        double laterHeight;
        for (int i = 0; i < 6; i++){
            laterHeight = height / 2.0;
            height = laterHeight;
            sum += laterHeight + laterHeight;
        }
        System.out.println("第六次落地共经过" + sum +"米");
}
}
