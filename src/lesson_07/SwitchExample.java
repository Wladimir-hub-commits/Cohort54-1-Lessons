package lesson_07;

import java.util.Random;

/**
 * Author Waldemar Ilz
 * {code data} 01.10.2024
 */

public class SwitchExample {
    public static void main(String[] args) {

        /*

        Оператор switch - позволяет сравнить назначение переменной с несколькими значениями.

         Форма записи -> switch (переменная для сравнения ) {

         case значение1:
                    // Блок кода 1
         case значение2:
                    // Блок кода 2
         case значение N:
                    // Блок кода N
         default:
                    // Блок кода default

         }
         */
        int x = 7;
        if (x == 5){
            System.out.println("if: x равен 5");
        }else if (x == 7 ){
            System.out.println("if: x равен 7");
        }else {
            System.out.println("if: что - то другое");
        }

        // switch

        switch (x){
            case 5:
                System.out.println("switch: x равен 5");
                break;
            case 7:
                System.out.println("switch: x равен 7");
                break;
            default:
                    System.out.println("switch:что то другое");

        }
        System.out.println("Продолжение программы");


        /*
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
         */
        Random random = new Random();

        int money = 100;
        int note = random.nextInt(5) + 1;
        System.out.println("Note:" + note);

        // Java 14 and higher
//        money = switch (note) {
//            case 5 -> money + 20;
//            case 4 -> money + 10;
//            case 2 -> money - 20;
//            case 3, 7, 8 -> 0;
//            case 1 -> 0;
//            default -> money;
//        };
        System.out.println("Money:" + money);
    }
}

