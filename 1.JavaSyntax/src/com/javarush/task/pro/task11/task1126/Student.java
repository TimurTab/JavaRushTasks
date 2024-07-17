package com.javarush.task.pro.task11.task1126;

/* 
Студент
*/

public class Student {
    public String name;

    public Student(String name) { // конструктор не имеет типа возвращаемого значения и пишется с большой буквы
        this.name = name; // мы указали, что обращаемся к текущей переменной
    }
}
