package hwk_08;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 10.10.2024
 */

/*

Task 4 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит правильное слово, программа благодарит его и завершает работу. Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
 */

public class cycleTask_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctWord = "hello"; // правильное слово
        String userInput;
        int attempts = 0; // счетчик попыток

        while (true) { // бесконечный цикл
            System.out.print("Введите слово 'hello': ");
            userInput = scanner.nextLine(); // считываем ввод пользователя
            attempts++; // увеличиваем счетчик попыток

            if (userInput.equals(correctWord)) { // проверяем правильность ввода
                System.out.println("Спасибо! Вы ввели правильное слово.");
                break; // выходим из цикла
            } else {
                System.out.println("Неправильное слово, попробуйте еще раз.");
            }
        }

        // вывод количества попыток
        System.out.println("Количество попыток: " + attempts);
        scanner.close(); // закрываем Scanner
    }
}
