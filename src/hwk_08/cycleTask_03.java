package hwk_08;

/**
 * Author Waldemar Ilz
 *{code data} 10.10.2024
 */

/*
Task 3
Используйте цикл while для решения задачи:

Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.

 */
public class cycleTask_03 {
    public static void main(String[] args) {

       int i = 1;
       int count = 0;

       while (i <= 100 && count < 7){
           // System.out.println("проверяет число:" + i);
           if (i % 5 == 0 ){
               System.out.print(i + ",\n");
               count++;
               i += 5; //Счётчик счисления на 5 быстрее

           }else {
               i++;
           }

       }
    }
}
