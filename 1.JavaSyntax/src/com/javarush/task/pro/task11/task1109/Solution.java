package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    //Outer outer = new Outer();
        Outer.Inner inner = new Outer(). new Inner(); // если класс не статический то требуется создание объекта внешнего класса.
        Outer.Nested nested = new Outer. Nested(); // если внутренний класс статический, то объект внешнего класс создавать не нужно.


    }
}
