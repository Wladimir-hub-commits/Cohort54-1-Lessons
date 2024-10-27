package lesson_10;

import java.util.Random;

public class ForLoopExample {
    public static void main(String[] args) {

        /*
        for (< Блок инициализации> ; <блок проверок / условие выхода>; <Блок изменений>){
            // Тело цикла
        }
        */

        // Пример while для сравнения
        // вывести все числа от 0 до 10
        int j = 0;
        while (j <= 10) {
            System.out.println(j + ",");
            j++;
        }



        System.out.println();
        System.out.println("End while loop");

        for (int i = 0; i <= 10; i++) {
            //тело цикла
            System.out.println(i + ",");
        }

        System.out.println();
        System.out.println("End loop for");


        System.out.println("\n=======================\n");


        //запустится бесконечный цикл
        // Для цикла for ни один из блоков не является обязательным
//        for( ; ; ){
//            System.out.println("Hello World");
//        }

        int x = 5;
        for (x = 0; x >= 0; x = x + 1_000_000) {
            System.out.println(x + ", ");
        }
        System.out.println();
        System.out.println("x после цикла:" + x);
        System.out.println("End #2");

        // В блоке инициализации может быть переменная любого типа

        for (String str = "Hello  "; str.length() < 10; str += "$") {
            System.out.println(str);
        }



        System.out.println("\n==================\n");
        //Мы можем инициализировать несколько переменных
        //В блоке изменений мы так же можем менять несколько переменных


        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }
        System.out.println("\n====================\n");
        // Например:
        // Создать массив целых чисел случайной длинны в диапазоне от 5 до 10
        // Заполнить массив случайными числами от - 50 до 50 включительно

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5]; // Получаем случайную длину
        System.out.println("длинна массива: " + ints.length);

        // Начиная с JDK 17 доступно задавать две границы диапазона
        //int rand = random.nextInt(4,11);
        //System.out.println("rand:" + rand);

        System.out.println("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // (0..100) - 50 -> (-50, 50)
            System.out.print( ints[i]  + (i < ints.length - 1 ? "," : "]\n"));
        }

        System.out.println("\n==================\n");


        // Операторы: continue, break

        for ( int i =0 ; i < 7; i++){

            if (i == 3) continue;
            //continue - прервать текущую инструкцию цикла и перейти и перейти к следующей(continue только когда i = 0)
            //Мы перейдем в блок изменения переменных, потом в блок проверки условия
            // В текущей итерации после вызов continue все операторы в теле цикла будут пропущены

            System.out.println(i + ", ");
        }
        System.out.println();
        System.out.println("\n==============\n");

        // Оператор Break
        for (int i = 0; i < 7 ; i++){

            if (i == 3) break;
            //break заканчивает текущую итерацию цикла и весь цикл (завершает работу цикла)
            // после вызова break следующие итерации цикла выполнены не будут
            System.out.println(i + ", ");
        }

        System.out.println();
        System.out.println("\n====================\n");

        // continue и break работают аналогичным образом в циклах while

        j = 1;
        while (j < 7){

            if (j ==3 ) {
                j++;
               continue;
            }

            System.out.println(j + "; ");
            j++;
        }
        System.out.println();
        System.out.println(" End While");

    }



}
