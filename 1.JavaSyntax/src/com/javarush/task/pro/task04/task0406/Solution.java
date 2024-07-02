package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
       Scanner r = new Scanner(System.in);
       while (true) {
           String w = r.nextLine();
           if (w.equals("enough")){
           break;
           }
           System.out.println(w);
       }//напишите тут ваш код
     
     
    }
}