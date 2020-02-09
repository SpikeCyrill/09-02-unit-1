package ru.kolosov;

//Класс описывающий сущьность "человек"
public class Person {

    /*СВОЙСТВА*/

    String name;
    String surname;
    String secondName;

    Integer age;

    /*МЕТОДЫ*/

    public String whoIAm() {
        return name + " " + surname + " " + secondName + " " + age;
    }

}
