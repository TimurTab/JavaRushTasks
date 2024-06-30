package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int min = k.nextInt();
        while (k.hasNextInt()){
            int w = k.nextInt();
            if (w<min){
            min=w;
            }
        }
        System.out.println(min);
      //  int chislo1 = kayboard.hasNextInt();//напишите тут ваш код

    }
}