package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Outer.Inner inner = new Outer(). new Inner(); //Создание объекта внутреннего класса
        Outer.Nested nested= new Outer.Nested(); //Создание объекта вложенного статического класса
    }
}
