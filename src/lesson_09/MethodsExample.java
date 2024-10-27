package lesson_09;

import java.util.Random;

/**
 * Author Waldemar Ilz
 *{code data} 10.10.2024
 */

public class MethodsExample {

    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();

        String string = "Java";
        System.out.println(string.length());

        System.out.println("\n===========");

        printChars(string);
        System.out.println("\n=========");
        printChars("Python!!!");

        System.out.println("\n==========");

        char ch = 'A';
        printDecimalCodeOfChar(ch);
        printDecimalCodeOfChar('d');
        printDecimalCodeOfChar('c');

        System.out.println("\n===========");

        int[] array = {12, 231, 566, 32, 0, 9};
        printArray(array);

        array[3] = 1000;
        array[0] = -5032000;

        printArray(array);
        int[] array2 = {1, 32, 348, 9, 2598, 6984, 147};
        printArray(array2);

      /*
      Перегрузка Методов

      В приделах одного класса может быть два или более методов с одинаковым именем,
      но разным набором параметров.

       */

        String[] strings = {"Java", "Python", "Hello", "World"};
        printArray(strings);

        //Написать метод который выводит  в кансоль числа от 1 до N
        printNumbers(6);


        // Написать метод, который выводит в кансоль числа от x до y
        printNumbers(3, 8);


        printNumbers("Java", 3 );
        printNumbers(100, "Python!");

        System.out.println("\n====================\n");
        int temp = 55;
        changeMe(temp);

        System.out.println(temp);

        int[] arr = {1,2,3,4,5};
        changeMe(arr);
        printArray(arr);

        String java = "Java";
        changeMe(java);
        System.out.println(java);

        int[] arr2 = new int[10];
        printArray(arr2);
        fillArrayRandom(arr2,101);
        printArray(arr2);


    } // Methods area

    public static void fillArrayRandom(int[]array,int bound){
        Random rand = new Random();
        int i = 0;
        while (i < array.length ){
            array[i] = rand.nextInt(bound);
            i++;
        }

    }

    public static void changeMe(String str){
        str = str + "!!!";
    }

    public static void changeMe(int[] array) {
        array[0] = 100_000_000;
    }
    public static void changeMe(int x){
        x = 100;
    }

    public static void printNumbers(String str, int x) {
        System.out.println("Option2!!!");
    }
    public static void printNumbers(int x, String str){
        System.out.println("Option1!!!");

    }public static void printNumbers(int x, int y){
        int i = x;
        while (i <= y){
            System.out.println(i + ", ");
            i++;
        }
        System.out.println();
    }

    public static void printNumbers(int number){
        int i = 1;
        while (i <= number){
            System.out.println(i + ", ");
            i++;
        }
        System.out.println();

    }

    public static void printArray(String[]strings){
        System.out.println("[");
        int i = 0;
        while(i < strings.length) {
            System.out.print(strings[i] + (i < strings.length - 1 ? "," : "]\n"));
            i++;
        }
    }


    // Метод который красиво выводит массив в консоль
    public static void printArray(int[] array){
        System.out.println("[");
        int i = 0;
        while(i < array.length) {
            System.out.print(array[i] + (i < array.length - 1 ? "," : "]\n"));
            i++;
        }
    }

    // Выводит на экран 10 - й код символа
    public static void printDecimalCodeOfChar(char ch) {
        System.out.println((int)ch);

    }

    // Распечатать все символы строки в отдельной строчке
    public static void printChars(String str){

           int i = 0;
           while (i < str.length()){
               char ch = str.charAt(i);
               System.out.println(ch);
               i++;

           }
       // System.out.println("Переменная в методе:" + str);
    }


    // Метод без возвращаемого значения (void - Method)
    public static void sayHello(){
        //Тело метода
        System.out.println("Hello World!");
    }






}//End class







