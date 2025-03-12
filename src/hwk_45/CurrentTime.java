package hwk_45;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Author Waldemar Ilz
 * {code data} 12.03.2025
 */

/*
Task 1
* Получить и вывести на экран:
   текущую дату
    текущий год, месяц и день
* Создать дату, например Ваш день рождения и вывести на экран
* Создать две даты и проверить на равенство
* Получить и вывести на экран:
    текущее время
    текущее время + 3 часа
* Создать дату:
    которая на неделю позже сегодняшней
    которая была на год раньше сегодняшней используя метод minus
    которая на год позже сегодняшней
    tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */

public class CurrentTime {
    public static void main(String[] args) {

// 1. Получить и вывести на экран текущую дату
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата: " + today);

        // 2. Получить текущий год, месяц и день
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println("Текущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);

        // 3. Создать дату, например Моего день рождения и вывести на экран
        LocalDate birthday = LocalDate.of(1990, 6, 15); // Замените на вашу дату рождения
        System.out.println("Моя дата рождения: " + birthday);

        // 4. Создать две даты и проверить на равенство
        LocalDate date1 = LocalDate.of(2023, 10, 10);
        LocalDate date2 = LocalDate.of(2024, 10, 25);
        System.out.println("date1 и date2 не равны: " + date1.equals(date2));

        // 5. Получить и вывести на экран текущее время
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);

        // 6. Текущее время + 3 часа
        LocalTime timePlusThreeHours = currentTime.plusHours(3);
        System.out.println("Текущее время + 3 часа: " + timePlusThreeHours);

        // 7. Создать дату, которая на неделю позже сегодняшней
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Дата на неделю позже сегодняшней: " + nextWeek);

        // 8. Создать дату, которая была на год раньше сегодняшней
        LocalDate lastYear = today.minusYears(1);
        System.out.println("Дата на год раньше сегодняшней: " + lastYear);

        // 9. Создать дату, которая на год позже сегодняшней
        LocalDate nextYear = today.plusYears(1);
        System.out.println("Дата на год позже сегодняшней: " + nextYear);

        // 10. Завтра и вчера
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Завтра: " + tomorrow);
        System.out.println("Вчера: " + yesterday);

        // Проверка, находятся ли они до или после сегодняшней даты
        System.out.println("Завтра находится после сегодняшней: " + tomorrow.isAfter(today));
        System.out.println("Вчера находится до сегодняшней: " + yesterday.isBefore(today));
    }

}
