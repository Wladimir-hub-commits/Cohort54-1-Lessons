package lesson_08;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array; // Объявление масива
        String[] strings;
        //int array1[]; //альтернативный способ обявления масива.( Не рекомендуется)

        // Объявление Масива
        array = new int[4];// создание (инициализация масива типа int c 4 ячейками
        strings = new String[10];// Создание масива строк с 10 ячейками


        int[] array2 =  new int[8]; // объявили иинициализировали маив int на 8 ячеек

        /*
                Значение по умолчанию
                 1. Для всех числовых типов ( втом числе char) это будет 0 (0.0)
                 2. Для boolean ß false
                 3. Для всех ссылочных типов - null ( null - ничего)
         */

        // Обращение к элементу масиву по индексу (номеру ячейки)
        int value = array2[0];
        System.out.println("array2[0]:" + value); // 0
        System.out.println("strings[2]:" +strings[2]); //null


        boolean[] bools = new boolean[4];
        System.out.println("bools[3]:" + bools[3]);

        //
        System.out.println("\n================");
        int[] numbers = new int[] {45,56,-16,45,0,159,1444}; // явная инициализация масива
        int length = numbers.length; //Длина масива ( количество ячеек / элементов в масиве)
        System.out.println("длина масива (количество ячеек / элементов) в масиве numbers:" + length);


        int[] ints = {-10,54,32323,444};// Явная инициализация масива

        System.out.println(" в 0 ячейке масива numbers находится число:" + numbers[0]);
        System.out.println(" в 2 ячейке масива ints находится число:" + numbers[2]);
        System.out.println(" в 9 ячейке масива string находится число:" + numbers[5]);

        System.out.println(ints);// Получим визуализированную ссылку на адрес в памяти (Heap) находится наш масив

        System.out.println("\n===============");
        System.out.println("Распичатываем масив ints:");

        int i = 0;
        while (i < ints.length){
            System.out.print(ints[i] + ",");
            i++;
        }
        System.out.println();

        // [1,2,3,4,5,6]

        System.out.println("\n======= Распичатываем масив красиво =======");
        String arrayToString = "[";
        i = 0;
        while (i < numbers.length) {
            arrayToString += numbers[i]; // приклеиваем текущее значение из масива

            if (i != numbers.length -1){
                arrayToString += ", ";

            }else{
                arrayToString += "] ";
            }

            i++;
        }

        System.out.println(arrayToString);

        System.out.println("\n======Присвоивание значений элемеента масива");
        int[] numbers2 = new int[10];

        numbers2[2] = 10; // Присвоение новогозначения элементу масива с индексом 2
        System.out.println("numbers2[2]:" + numbers2[2]);

        // Заполнить масив случайными числами от 0 до 100
        Random random = new Random();

        int k = 0;
        System.out.println("[");
        while (k < numbers2.length){
            numbers2[k] = random.nextInt(101);
            System.out.print(numbers2[k] +", ");
        }
        System.out.println("]\n");


        System.out.println("\n======Поиск минимального значения в масиве========");
        i = 0;
        int min = numbers2[0];
        while (i < numbers2.length){
            if (numbers2[i] < min){
                min = numbers2[i];
            }
            i++;
        }
        System.out.println("Минимальное значение в масиве:" + min);


        }

    }

