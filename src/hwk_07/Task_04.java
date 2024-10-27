package hwk_07;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 05.10.2024
 */

 /*
Task 4
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7. Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
  */
public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа просит пользователя ввести числа от 1 до 7");
        int input = scanner.nextInt();
        scanner.nextLine();

         switch (input){
             case 1:
                 System.out.println(" Понедельник " );
                 break;
             case 2:
                 System.out.println("Вторник" );
                 break;
             case 3:
                 System.out.println("Среда");
                 break;
             case 4:
                 System.out.println("Четверг");
                 break;
             case 5:
                 System.out.println("Пятница");
                 break;
             case 6:
             case 7:
                 System.out.println("Выходной");
                 break;
             default:
                 System.out.println("Таких дней недели не придумали");



         }

        // JDK 17 or higher!!!
//        String bigString = """
//                Привет
//                ваапвпфук у
//                ек ец ц
//                """;

//        System.out.println(bigString);

    }
}
