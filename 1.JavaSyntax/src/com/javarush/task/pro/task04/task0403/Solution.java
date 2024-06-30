package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int q = 0;
        boolean rom = false;
        while (!rom) {
            if (console.hasNextInt()){
                int t = console.nextInt();
                q = q + t;
                
            }
            else if (console.hasNextLine()) {
               String sac = console.nextLine();
               rom = sac.equals("ENTER");
             
              
            }
        //System.out.println(rom); //напишите тут ваш код
       }
       System.out.println(q);
    }
}