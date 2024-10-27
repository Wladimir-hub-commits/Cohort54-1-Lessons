package lesson_06;


/**
 * Author Waldemar Ilz
 *{code data} 26.09.2024
 */

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");


        System.out.println(str1 + "|" + str2 + "|" + str3 + "|" + str4);
        boolean b1 = str1 == str2;

        System.out.println("str1 == str2 -> " + b1); // true
        System.out.println("str1 == str3 -> " + (str1 == str3)); // true
        System.out.println("str1 == str4 -> " + (str1 == str4)); // false

        // Важно ! ! !
        // Сравнение строк по значениям мы ДОЛЖНЫ делать методом equals !!!

        boolean isEquals = str1.equals(str2);
        System.out.println(str1 + "equals(" + str2 + ") -> " + isEquals);// true
        System.out.println(str1 + "equals(" + str3 + ") -> " + str1.equals(str3)); // false
        System.out.println(str1 + "equals(" + str4 + ") -> " + str1.equals(str4)); // true
        System.out.println(str1 + "equals(" + str3 + ") -> " + str1.equalsIgnoreCase(str3)); // true


    }
}
