package ru.kolosov;

//Главный класс приложения
public class Application {

    //Главный метод - точка входа в программу (джавамашина вызывает этот метод).
    public static void main(String[] args) {

        //Объявление переменной
        byte myByte;

        //Инициализация переменной
        myByte = 126;
        System.out.println(myByte); //Вывод значения в консоль

        //Операция инкремента
        myByte++;
        System.out.println(myByte);

        myByte++;
        System.out.println(myByte);

        //Объявление переменной с одновременной инициализацией
        int a = 10;

        //Объявление массива с одновременной инициализацией
        int[] intArray = new int[10];
        System.out.println(intArray.length);

        //
        intArray[0] = 15;
        intArray[2] = 20;

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);

        intArray[5] = a;

        int[] intArrayFromValues = {1, 2, 5, 7};

        boolean myTrue = true;
        boolean myFalse = false;

        if(myFalse == myTrue) {
            System.out.println("myFalse == myTrue");
        } else if(myTrue == true) {
            System.out.println("myTrue == true");
        } else {
            System.out.println("all false");
        }

        if(myFalse == false) System.out.println("short if");

        System.out.println();
        System.out.println("switch:");
        switch (a) {
            case 0:
                System.out.println("0"); break;
            case 5:
                System.out.println(">0"); break;
            case 10:
                System.out.println(">5"); break;
            case 15:
                System.out.println(">10"); break;
            default: System.out.println(">15");
        }

        System.out.println();
        System.out.println("for:");
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

            if(i % 2 != 0) continue;

            System.out.println("even");
        }

        for(;true;) {
            System.out.println("infinite loop");
            break;
        }

        System.out.println();
        System.out.println("while:");

        int firstIndex = 10;
        while (firstIndex < intArray.length) {
            System.out.println(intArray[firstIndex]);
            firstIndex++;
        }

        System.out.println();
        System.out.println("do while:");
        firstIndex = 9;
        do {
            System.out.println(intArray[firstIndex]);
            firstIndex++;
        } while (firstIndex < intArray.length);


        String myString = getString(-10);

        System.out.println(myString);

        System.out.println("end of method");


    }

    public static String getString(int value) {

        if(value > 0) {
            return "positive";
        }

        return "negative";
    }


}
