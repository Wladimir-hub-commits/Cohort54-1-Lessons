package hwk_09;

/**
 * Author Waldemar Ilz
 *{code data} 15.10.2024
 */

/*
Task4 * (опционально)
Написать программу, выводящую на экран треугольник, состоящий из
цифр от 1 до 6 такого вида:

1
12
123
1234
12345
123456
 */
public class Task_04 {
    public static void main(String[] args) {
        // Количество строк треугольника
        int rowCount = 6;

        // Внешний цикл для строк
        for (int i = 1; i <= rowCount; i++) {
            // Внутренний цикл для вывода цифр
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Переход на новую строку после завершения строки
            System.out.println();
        }
    }
}
