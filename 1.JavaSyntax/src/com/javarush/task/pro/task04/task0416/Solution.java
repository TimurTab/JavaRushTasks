package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
       Scanner kayboard = new Scanner(System.in);
       double onepot= kayboard.nextInt();
       double people= kayboard.nextInt();
       //double cola= 1.00;
       double happy = onepot*1.0/people;
        
         System.out.println(happy);
       //напишите тут ваш код

    }
}