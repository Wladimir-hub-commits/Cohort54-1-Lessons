package lesson_06;

import java.util.Random;

/**
 * Author Waldemar Ilz
 * {code data} 26.09.2024
 */

public class booleanExample {
    public static void main(String[] args) {


        boolean bol1 = true; // Истина / правда
        bol1 = false; // ложь / не правда

        int x = 10;
        int y = 5;

        // Операции сравнения.

        // Сравнения на равенство "=="
        boolean b1 = (x == y); // x равен  y -> 10 равно 5 -> false
        System.out.println(x + "==" + y + "->" + b1); // false
        // Ctrl + D - Дублировать строку

        // Сравнение на не равенство "!="
        b1 = x != y; // x не равно y -> 10 не равно 5 -> true
        System.out.println(x + "!=" + y + "->" + b1); // true

        y = 10;
        // Больше ">"
        b1 = x > y; // x Болше y -> 10 болше 10 -> false
        System.out.println(x + ">" + y + "->" + b1); // false

        // Больше или равно ">="
        b1 = x >= y; // x Болше или равно y -> 10 болше или равно 10 -> true
        System.out.println(x + ">=" + y + "->" + b1); // true

        // Меньше "<"
        b1 = x < y; // x Меньше  y -> 10 меньше  10 -> false
        System.out.println(x + "<" + y + "->" + b1); // false

        // Меньше или равно "<="
        b1 = x <= y; // x Меньше или равно y -> 10 меньше или равно 10 -> true
        System.out.println(x + "<=" + y + "->" + b1); // true

        String str = "Java is the best"; // Содержит ли эта строка подстроку "Java"
        boolean contains = str.contains("Java");
        // Экранирование символа. Сказать компьтеру, что этот символ не воспринимать как спец символ
        System.out.println("str.contains(\"Java\"):" + contains);

        // indexOf
        int index = str.indexOf("the"); // индекс начала первого вхождения в с троку4. Если нет вхождения - мы получим  - 1
        System.out.println("Индекс вхождения:" + index);
        contains = index != -1; // Если индекс равен -1, то вхождение найдено. Contains будет true / Иначе false
        contains = index >= 0; // Если индекс равен -1, то вхождение найдено. Contains будет true / Иначе false
        System.out.println("contains:" + contains);

        // lastIndexOf
        // тоже ищет вхождения подстроки в строку. Но ищет последнее вхождение.
        index = str.lastIndexOf("the");
        System.out.println("Индекс последнего вхождения : " + index);

        // Логические операции.
        System.out.println("\n==========Логические операции=========");

        // Логическое НЕ (NOT) - отрицание " ! "
        // Меняет значение boolean на противоположное
        boolean b2 = !false;  // получим значение true
        System.out.println("!false:" + !false);

        b2 = !(4 != 5); //!true -> false
        System.out.println("(4 !=5):" + b2);

        // Составные логические операции - объединение двух условий

        /*
        Логическая И "&"
        Используется когда нужно, чтобы оба условия были истинными
        Рим столица Италии & Берли столица Голандии
        // Если хотя бы в одной части будет  false -> в результате мы получим false

         */
        b2 = true & true; // true
        System.out.println("true & true:" + b2);
        b2 = (2 < 5) & (11 == 10); // true & false -> false
        System.out.println("(2<5) & (11 == 10):" + b2);

        //Введите число от 0 до 100.
        int z = 50;
        boolean b3 = z > 0 & z < 100;

        // Логическая или "|"
        // Когда достаточно, чтобы хотя бы одно условие былло  истинным

        boolean b4 = true | false;
        b4 = false | false; // false
        System.out.println("false | fale: " + b4);
        System.out.println("true | false:" + (true | false));

        // Ввведите или чётное число,или число, которое делится на 5 без остатка
        // Чётное число это число, которе делится на 2 без остатка. Остаток от деления на 2 равен 0.

        // Генерация случайног числа (псевдослучайного числа)
        Random random = new Random(); // Генерирует всё (числа,строки,знаки и тд..)
        int rand = random.nextInt(101); // 0...100 - 1) -> (0..100)
        System.out.println(" Случайное число:" + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven" + isEven);
        System.out.println(" isGoodNumber:" + isGoodNumber);

        //Логическая искулючающая ИЛИ (XOR) "^"
        // Возвращает true если две части выражения разные
        boolean b5 = true ^ false; // true
        System.out.println("true ^ false:" + b5);
        b5 = false ^ false;
        System.out.println("false ^ false:" + b5);// false
        System.out.println("true ^ true:" + (true ^ true));// false
        System.out.println("false ^ true:" + (false ^ true));// false

        System.out.println("\n=============&&============");

        // Логическая сокращённая И "&&"
        // Выдает true только если обе части выражения равны true
        boolean b6 = false && true; // false
        System.out.println("false && true:" + b6);
        b6 = (2 > 5) && (11 == 11);

        int a = 10;
        int b = 0;
        // boolean b7 (a / b > 0 ); // На ноль делить нельзя
        
        // Правая часть НЕ ЧИТАЕТСЯ (не выполняется просчёт значения ),
        // так как в левой части false  и значение переменной b7 не зависит от правой части . Смысл её считать?
        boolean b7 = (b != 0) && (a / b > 0);// 0 != 0 -> false //
        System.out.println(b7);

        System.out.println("\n================= || ==============");

        // Логическое сокращённое ИЛИ " || "
        // Выдаёт true если хотябы одна часть выражения равна true
        boolean b8 = true || (a / b > 2);
        System.out.println("b8" + b8);

        System.out.println("\n====================");

        // Приоритет выполнения логических операций
        /*
        1.() -> 2.! ->  3.& ->  4.^ -> 5.| ->  6.&& ->  7.||
         */
        // Изменить приоритет логических операций можно скобками

        System.out.println(2 + 10 / 2);

        System.out.println(true ^ true & false); // true
        System.out.println(true ^ false); // true
        System.out.println(true); // true


        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println( false);

        //1.() -> 2.! ->  3.& ->  4.^ -> 5.| ->  6.&& ->  7.||

        System.out.println("+++++++++++++++++");
        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;

        System.out.println(aa | bb | cc < 100 & !aa ^ qq == 5);
        System.out.println(true | false | (25 < 100) & !true ^ (2 == 5));
        System.out.println(true | false | true & !true ^ false);
        System.out.println(true | false | true & false ^ false);
        System.out.println(true | false | false ^ false);
        System.out.println(true | false | false);
        System.out.println(true | false);
        System.out.println(true);

    }

}
