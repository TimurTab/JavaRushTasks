package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
       Scanner console= new Scanner(System.in);
       int speed = console.nextInt();
       double wind = speed*3.6;
       int result = (int)Math.round(wind);
       System.out.print(result);//напишите тут ваш код

    }
}