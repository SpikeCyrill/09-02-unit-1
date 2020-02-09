package ru.kolosov;

public class Person {

    String name;
    String surname;
    String secondName;

    Integer age;

    public String whoIAm() {
        return name + " " + surname + " " + secondName + " " + age;
    }

}

class SecondClass {

}
