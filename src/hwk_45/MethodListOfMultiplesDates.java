package hwk_45;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * Author Waldemar Ilz
 * {code data} 12.03.2025
 */

/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий
 количество дней между самой ранней и поздней датами в этом списке
 */

public class MethodListOfMultiplesDates {
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2025, 10, 1),
                LocalDate.of(2023, 10, 5),
                LocalDate.of(2024, 9, 25)
        );

        long daysDiff = daysBetween(dates);
        System.out.println("Количество дней между самой ранней и самой поздней датами: " + daysDiff);

    }

    public static long daysBetween(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("Список дат не должен быть пустым.");
        }

        LocalDate earliestDate = dates.get(0);
        LocalDate latestDate = dates.get(0);

        for (LocalDate date : dates) {
            if (date.isBefore(earliestDate)) {
                earliestDate = date;
            }
            if (date.isAfter(latestDate)) {
                latestDate = date;
            }
        }

        return ChronoUnit.DAYS.between(earliestDate, latestDate);
    }


}
