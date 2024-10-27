package hwk_08;

/**
 * Author Waldemar Ilz
 *{code data} 10.10.2024
 */

/*
Циклы
Task 1
Найдите произведение всех чисел от 1 до 10 включительно.

Результат выведите на экран

 */
public class cycleTask_01 {
    public static void main(String[] args) {

        long mult = 1;

        int i = 1;
        while ( i <= 10 ){
            mult *= i;
            i++;

        }

        System.out.println(" Произведение чисел:" + mult);


    }

}
