package lesson_27.enums.days;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public class DayApp {
    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println("day: " + day);
            System.out.println("day.getRussianName(): " + day.getRussianName());
            System.out.println("day.getDayNumber(): " + day.getDayNumber());
            System.out.println(day.testMethod());
            System.out.println("\n=================");
        }
    }
}
