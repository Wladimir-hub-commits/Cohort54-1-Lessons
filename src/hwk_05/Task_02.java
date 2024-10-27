package hwk_05;


/**
 * Author Waldemar Ilz
 *{code data} 25.09.2024
 */

/*
Task 2
1.Создайте строки:
*"Java"
*"is"
*"a"
*"powerful"
*"language"
*2.Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
*3.Выведите на экран получившуюся строку и её длину.
 */

/*
Task 2.2 * (Опционально)
1.Замените в результирующей строке слово "powerful" на "super".
2.Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
3.Выведите на экран значение этой переменной.

 */
public class Task_02 {
    public static void main(String[] args) {

        String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "language";

        String space = " ";

        // Первый способ приклеивания методом .join
        String concatStr = String.join(space,str,str1,str2,str3,str4);
        System.out.println("concatStr:" + concatStr);
        // + длина строки
        System.out.println("concatStr1:" + concatStr + " ;length:" + concatStr.length());

        // Второй способ приклеивания строки
        concatStr = str.concat(space)
                       .concat(str1).concat(space)
                       .concat(str2).concat(space)
                       .concat(str3).concat(space)
                       .concat(str4);

        System.out.println("concatStr1:" + concatStr + " ;length:" + concatStr.length());

        String result = concatStr.replace("powerful", "super");
        System.out.println("result:" + result);

        // Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        boolean isContains = result.contains("age");
        System.out.println("isContains:" + isContains);

    }
}
