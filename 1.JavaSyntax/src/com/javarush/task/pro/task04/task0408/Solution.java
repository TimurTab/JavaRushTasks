package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;;
        while (w.hasNextInt()){
            int r = w.nextInt();
            if (r>max){
                if (r%2==0){
                 max=r;
                }
                }
            }
         //напишите тут ваш код
           System.out.print(max);
    }
}