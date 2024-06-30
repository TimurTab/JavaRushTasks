package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        int x = concole.nextInt();
        int y = concole.nextInt();
        if (x>0 && y>0) {
            System.out.println("1");
        }
        else if (x<0 && y>0) {
            System.out.println("2");
        }
        else if (x<0 && y<0) {
            System.out.println("3");
        }
        else if (x>0 && y<0) {
            System.out.println("4");
        }//напишите тут ваш код
    }
}
