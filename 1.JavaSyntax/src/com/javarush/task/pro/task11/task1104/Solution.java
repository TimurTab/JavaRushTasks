package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишите тут ваш код
        int result;
        Double.parseDouble(string); //принимает строку и возвращает значение типа double.
        double number = Double.parseDouble(string); //здесь строка string преобразуется в значение типа double и сохраняется в переменной number
        number = Math.round(number); //здесь значение переменной number округляется до ближайшего целого числа
        result = (int) number; //преобразовваем переменную одного типа в другой тип.
        System.out.print(result);
    }
}
