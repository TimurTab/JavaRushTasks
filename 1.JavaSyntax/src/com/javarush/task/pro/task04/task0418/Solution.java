package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner kayboard = new Scanner(System.in);
        boolean halfglass = kayboard.nextBoolean();
        int answer;
        if (halfglass){
            answer = (int) Math.ceil(glass);
        }
        else{
            answer = (int) Math.floor(glass);
            }
            System.out.print(answer);//напишите тут ваш код
    }
}