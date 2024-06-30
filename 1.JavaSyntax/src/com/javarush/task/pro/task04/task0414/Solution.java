package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
       Scanner kayboar = new Scanner(System.in);
       int number = kayboar.nextInt();
       String line = kayboar.nextLine();
       do{
        System.out.print(line);
        number--;
       }
       while ( number<=0 && number>=5);
       {
          // System.out.println(line);
           
           
       }
           //напишите тут ваш код

    }
}