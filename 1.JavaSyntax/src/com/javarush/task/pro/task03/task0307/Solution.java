package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        int age = concole.nextInt();
        if (age < 20 || age >60) {//напишите тут ваш код
        System.out.println("можно не работать");
        }
    }
}
