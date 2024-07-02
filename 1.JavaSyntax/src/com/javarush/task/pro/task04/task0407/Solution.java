package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int e=0;
        int sum=0;
        while (e<=100) {
            if ((e%3)==0){
            e++;
            continue;
            }
            sum=sum+e;
            e++;
        }//напишите тут ваш код
           System.out.print(sum);
    }
}