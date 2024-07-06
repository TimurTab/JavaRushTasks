package com.javarush.task.pro.task05.task0519;

import java.sql.SQLOutput;
import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 11;

    public static void main(String[] args) {
        //напишите тут ваш код
        int[] arraycopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arraycopy);
        int arraysearch = Arrays.binarySearch(arraycopy, element);
        if(arraysearch>= 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
