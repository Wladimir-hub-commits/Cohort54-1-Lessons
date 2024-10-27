package hwk_06;


import java.util.Random;

/**
 * Author Waldemar Ilz
 *{code data} 01.10.2024
 */

/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

1.равны ли переменные,

2.не равны ли они,

3.больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран.

 */
public class Task_02 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(51); // [0.1...49,50]
        int b = random.nextInt(101); // [0...100]
        b = random.nextInt(51)-20;// [0...50] -> 0 - 20 -> -20; 20 - 20 -> 0; 50 - 20;


        System.out.println("a: " + a);
        System.out.println("b: " + b);

        boolean check = a == b;
        System.out.println(a + " == " + b + " -> " + check);
        check = a != b;
        System.out.println(a + " != " + b + " -> " + check);
        check = a  > b ;
        System.out.println(a + " > "  + b + " -> " + check);
        check = b  < a ;
        System.out.println(b + " < " + a + " -> " + check);




    }
}
