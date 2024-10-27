package lesson_05;

/**
 * Author Waldemar Ilz
 *{code data} 24.09.2024
 */

public class StringExample {
    public static void main(String[] args) {
        String string = "Java"; // Объявление и инициализация переменной тип String.
        String string1 = new String("Hello"); // Тоже создание новой строки. Но не рекомендованный

        System.out.println(string);

        // название метода с круглыми скобками - вызов метода
        System.out.println(string.length()); // количество символов в строрке (длина строки)

        // Метод позволяет перевести все символы строки в верхний регистор
        System.out.println(string.toUpperCase()); // символы строки в верхний регистр
        System.out.println(string);

        // String -иммутабельна ( неизменяемая)
        // Если я хочу сохранить результат работы метода - я должен сохранить его в какую-то переменную
        String string2 = string.toUpperCase();
        System.out.println("string2:" + string2 );
        System.out.println("string:" + string);

        //toLowerCase() - переводит все символы строки в нижний регистр ( маленькие буквы)
        string2 = string2.toLowerCase();
        System.out.println("string2:" + string2);

        System.out.println("+++++++++++++++++");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты склеивания / объединение строки
        // + Конкатенация объединения строк
        String concatStr = str1 + str2 + str3 + "! ! !";
        System.out.println(concatStr);

        String concatStr2 = str1.concat(str2); //str1 + str2
        concatStr2 = concatStr.concat(str3);
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat("???");// str1 + str2 + str3 + "???"
        System.out.println(concatStr3);

        String concatStr4 = String.join("  ", str1, str3, "!!!");
        System.out.println("concatStr4:" + concatStr4);

        System.out.println("================");

        //Привеление типов
        // Когда есть строка - знак плюс - знак конкантенации. И все операнды (участники операции) преобразуются к строке
        int a = 1; // "1"
        int b = 2;
        String string3 = "Hello";
        System.out.println(string3);

        //              1 + 2 = 3 -> "3" + "Hello" + (1 + 2)
        // Приоритет операций мы можем задать скобки
        System.out.println(a + b + string3 + " = " + (a + b));

        System.out.println("=====================\n");

        String digits = "0123456789"; // Номера в строке называются индексом
        System.out.println(digits.length());
        String digits2 = "9876543210";

        char firstChar = digits.charAt(0); // Взят символ под индексом (номером) 0 из строки digits
        char firstChar2 = digits2.charAt(0); // Взят символ под индексом (номером) 0 из строки digits2
        System.out.println("first from digits:" + firstChar);
        System.out.println("first from digits2:" + firstChar2);

        int length = digits.length();
        //Не зависимо от фактической длины строки, индекс последнего элемента всегда равен - 1
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("last from digits:" + lastChar);
        System.out.println(digits2.charAt(digits2.length() - 1));// последний символ в строке digits2

        System.out.println("==================\n");
        String subString = digits.substring(2); // Выделить подстроку начиная с индекса 2 до конца строки
        System.out.println("digits.substrings(2):" + subString);
        System.out.println("digits:" + digits); // Начальная строка остается не измененой
        //                      [ 2, 7) -> 2,3,4,5
        subString = digits.substring(2, 7 );// Взять подстроку от индекса 2 включительно до индекса 7 не включительно

        System.out.println ("digits.substring(2, 7 ): " + subString);

        System.out.println("==============Replace===========\n");
        String string4 = "OneTwoOneThreeFor";
        String replace = string4.replace("One", "Stop");// Заменить все найденные строк "One" на "Stop"
        System.out.println("replace:" + replace);
        replace = string.replaceFirst("One", "Stop"); // Заменить первое найденное "One" на "Stop"
        System.out.println("replaceFirst:" + replace);

    }
}
