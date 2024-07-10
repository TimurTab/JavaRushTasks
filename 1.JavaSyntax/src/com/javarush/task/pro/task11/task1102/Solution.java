package com.javarush.task.pro.task11.task1102;

/* 
Земля: техническая характеристика
*/

public class Solution {

    public static void main(String[] args) {
        // если переменые не статические то к ним мы обращаемся только после создиния объекта.
        // static - это что-то общее.
        // не  stetic характеристика именно конкретное значение, для каждого объекта своё.
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
