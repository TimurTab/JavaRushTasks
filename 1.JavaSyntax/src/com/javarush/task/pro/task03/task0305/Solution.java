package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
       boolean a1 = a == b;
       boolean a2 = b == c;
       boolean a3 = c == a;
       boolean c1 = a!=b;
       boolean c2 = b!=c;
       boolean c3 = c!=a;
     //  boolean b1 = a != b;
       //boolean b2 = b == c;
       //boolean b3 = c != a;
      // boolean w1 = a == b;
       //boolean w2 = b != c;
       //boolean w3 = c != a;
       //boolean e1 = a != b;
       //boolean e2 = b != c;
       //boolean e3 = c == a;
       if (c1&&c2&&c3){
          // System.out.println(a + " " + b + " " + c);
       }
       else if (a1&&a2&&a3) {
           System.out.println(a + " " + b + " " + c);
           }
         else if (a1&c2&c3){
             System.out.println(a + " " + b);
         }  
         else if (c1&a2&c3){
             System.out.println(b + " " + c);
            }//напишите тут ваш код
            else if (c1&c2&a3){
             System.out.println(c + " " + a);
            }
            else {
            }//напишите тут ваш код
    }
}
