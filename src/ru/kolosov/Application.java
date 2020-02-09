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

        //Присваиваем значения элементам массива по их порядковому номеру
        intArray[0] = 15;
        intArray[2] = 20;

        //Выводим в консоль значения элементов массива по их порядковому номеру
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);

        //присваиваем элементу массива значение переменной
        intArray[5] = a;

        //Создаем массив из набора значений
        int[] intArrayFromValues = {1, 2, 5, 7};

        boolean myTrue = true;
        boolean myFalse = false;

        //Ветвление - полная запись
        if(myFalse == myTrue) {
            System.out.println("myFalse == myTrue");
        } else if(myTrue == true) {
            System.out.println("myTrue == true");
        } else {
            System.out.println("all false");
        }

        //Ветвление - проверка одного условия с одним действием, короткая запись
        if(myFalse == false) System.out.println("short if");

        System.out.println();
        System.out.println("switch:");
        //Переключение
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
        //Цикл "для" - полная запись
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

            if(i % 2 != 0) continue;

            System.out.println("even");
        }

        //Цикл "для" - альтернатива с пропущенными блоками
        for(;true;) {
            System.out.println("infinite loop");
            break;
        }

        System.out.println();
        System.out.println("while:");

        int firstIndex = 10;
        //Цикл с предусловием
        while (firstIndex < intArray.length) {
            System.out.println(intArray[firstIndex]);
            firstIndex++;
        }

        System.out.println();
        System.out.println("do while:");
        firstIndex = 9;
        //Цикл с постусловием
        do {
            System.out.println(intArray[firstIndex]);
            firstIndex++;
        } while (firstIndex < intArray.length);

        //Вызов метода с одним параметром и запись результата в переменную myString
        String myString = getString(-10);

        System.out.println(myString);

        System.out.println("end of method");


    }

    //Объявление метода, возвращающего значение типа строка с одним параметром
    public static String getString(int value) {

        if(value > 0) {
            return "positive"; //Возврат значения
        }

        return "negative"; //Возврат значения
    }


}
