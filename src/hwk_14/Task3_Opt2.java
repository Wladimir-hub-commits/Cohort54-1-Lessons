package hwk_14;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

public class Task3_Opt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово");


        String cyr = "аеиоуюя";

        String input = scanner.nextLine();
        calculateCharacter(input);


    }

    public static void calculateCharacter(String text) {

        int vowels = 0;
        int consonants = 0;

        String vowelsList = "AEIOUaeiou";
        String consonantsList = "ZXCVBNMSDFGHJKLWRTYPzxcvbnmsdfghjklwrtyp";


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);


            if (vowelsList.indexOf(ch) >= 0) {
                // возвращает нам индекс вхождения символа в строку
                // Если символ найден - вернется какое-то положительное число - индекс символа в строке
                // Если символ не найден - метод вернет -1.
                vowels++;
            }

            if (consonantsList.indexOf(ch) >= 0) {
                consonants++;
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }

}
