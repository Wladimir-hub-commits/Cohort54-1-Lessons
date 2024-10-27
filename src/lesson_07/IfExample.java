package lesson_07;

import java.util.Random;
import java.util.Scanner;

/**
 * Author Waldemar Ilz
 * {code data} 01.10.2024
 */



public class IfExample {
    public static void main(String[] args) {

        int x = 5;

        /*
         если x = 15 то выполняется блок if
         если x = 5 то выполняется блок else
         если x = 8 то выполняется блок else if
         */
        /*
        if ( Условие) оператор;

        if ( условие) оператор
        else оператор; else if - проверка блока

        if (условие 1) оператор // есле это условие выполнится
        else if (условие 2 ) оператор //если иначе если это условие выполнится
        else операор
         */

        if (x > 11) { // условие false, блок не выполняется. переходим в блок else if/
            System.out.println(" Всем привет ");
            System.out.println("сейчас x равен:" + x);
        } else if (x > 7) {
            System.out.println("Мы находимся в блоке ELSE IF");
            System.out.println("Сейчас x равен:" + x);
        }else  {
            System.out.println("Мы находимся в блоке ELSE");
            System.out.println("Сейчас x равен:" + x);
        }

        System.out.println("Продолжение выполнения программы");

        System.out.println("==============\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число 1 или 10");
        int number = scanner.nextInt();
        scanner.nextLine(); // Обнулить сканер

        if (number == 1){
            System.out.println(" Вы ввели число один");
        }else if (number == 10) {
            System.out.println("Вы ввели число 10");
        }else{
            System.out.println("Вы ввели не верное число!!!");
        }

        // Введите число от 1 до  20 или от 30 до 50
        System.out.println("Введите число от 1 до  20 и от 30 до 50");
        number = scanner.nextInt();
        scanner.nextLine();

        if (number >= 1 && number <= 20){
            System.out.println("Вы ввели число от 1 до  20");
        } else if (number >= 30 && number <=50 ){
            System.out.println("Вы ввели число от 30 до  50");

        }else {
            System.out.println("Вы ввели неверное число");
        }
        System.out.println("=====================\n");

        /*
        Пример:

        У ребёнка есть карманные деньги. Для простоты используем тип int. И сейчас у него 100 денег.
        Ребёнок пришол ишколы и принёс оценку (от 1 до 5 включительно).
        Можно запросить  оценку из консоли или сгенерировать случайную
        За хорошие оценки ребёнок получает деньги, за плохие отбирают.
        5 -> +20
        4 -> +10
        3 -> 0
        2 -> -10
        1 -> забирают все деньги

        Выведите оценку на экран
        Выведите оставшееся количество денег у ребёнка

         */
            int money = 100;
            int note;

        Random random = new Random();

        //  System.out.println("Какую оценку получил ребёнок?");
        //note  = scanner.nextInt();
        //scanner.nextLine();
        note = random.nextInt(5) + 1; // [1..5] -> [0...4] +1
        System.out.println("Случайная оценка:" + note);

        if (note == 5){
            money += 20; // money = money +20;
        }else if (note == 4){
            money += 10;
        }else if (note == 3) {

        } else if (note == 2) {
            money -= 10;

        } else if (note == 1) {
            money = 0;
        }else {
            System.out.println("Таких оценок не бывает");
        }
        System.out.println("У ребёнка сейчас денег:" + money);

        System.out.println("\n=========Поиск минимльного Значения======= 8");
        int v1 = random.nextInt(51);
        int v2 = random.nextInt(51);
        int v3 = random.nextInt(51);

        System.out.println(v1 + "|" + v2 + "|" + v3 );

        int min = v1;
        if (v2 < min){
            min = v2;
        }
        if (v3 < min) min = v3;
        System.out.println("Минимальное значение:" + min);
    }


}




