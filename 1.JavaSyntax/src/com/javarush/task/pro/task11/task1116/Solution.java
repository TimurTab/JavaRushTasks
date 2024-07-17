package com.javarush.task.pro.task11.task1116;

/*
Правильный класс
*/

public class Solution { // основной класс внутри пакета
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}
 class Cat { // это внешний класс
    String name = "Tom";
}