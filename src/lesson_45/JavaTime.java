package lesson_45;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Author Waldemar Ilz
 * {code data} 11.03.2025
 */

/*
java.util.Date
java.util.Calendar
java.tex.SimpleDateFormat

В  Java 8
Joda - Time -> JavaTime (java.time)
 */

public class JavaTime {

    public static void main(String[] args) {

        // LocalDate - представляет дату (год, месяц, день) без времени и часового пояса

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("now: " + date);

        // прибавить 1 день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + date);
        System.out.println("plusWeeks: " + date.plusWeeks(4));// плюс 4 недели к дате
        System.out.println("yesterday: " + date.minusDays(1));//минус 1 день

        LocalDate date1 = LocalDate.of(2002, 2, 15);//Установить дату (год, месяц, число)
        System.out.println("date1: " + date1);

        // Можно использовать Enum с названиями месяцев
        date1 = LocalDate.of(2004, Month.FEBRUARY, 15);// Установить дату
        System.out.println("date1: " + date1);//

        System.out.println("год: " + date1.getYear() + " месяц - enum: " + date1.getMonth() + "месяц - число: " + date1.getMonthValue());
        System.out.println("число: " + date1.getDayOfMonth() + " день недели: " + date1.getDayOfWeek() + " день  года: " + date1.getDayOfYear());
        System.out.println("дней в месяце: " + date1.lengthOfMonth() + " дней в году: " + date1.lengthOfYear() + "isLeapYear: " + date1.isLeapYear());

        String dateString = "2010-10-25";// Формат строки год-месяц-число
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println("date2: " + date2);


        System.out.println("\n=====LocalTime=====\n");
        // LocalTime - время суток (часы, минуты, секунды, наносекунды)

        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("time: " + time);

        time = LocalTime.of(21, 33);
        time = LocalTime.of(21, 33, 44);
        time = LocalTime.of(21, 33, 44, 546342);

        System.out.println("time: " + time);

        System.out.println("Time.plusHours: " + time.plusHours(1));// возвращает новый объект LocalTime + 1 час к старому объекту
        System.out.println("time.plusMinutes" + time.plusMinutes(65));
        System.out.println("time.minusSeconds" + time.minusSeconds(30));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());
        String timeString = "21:33:45";
        LocalTime time2 = LocalTime.parse(timeString);
        // ожидает String в формате ISO-8601 ("2001-01-15T08:15:45+01:00")
        System.out.println("time2: " + time2);

        System.out.println("\n=====LocalDateTime=====\n");
        // LocalDateTime - представляет дату и время без учета часового пояса
        LocalDateTime localDateTime = LocalDateTime.now();// получить текущие дата-время
        System.out.println("LocalDateTime.now():" + localDateTime);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 33);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime1:" + dateTime);
        dateTime = LocalDateTime.of(2025, 12, 31, 23, 59); // год, месяц, день, час, минута
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());

        // Доступны все методы классов LocalDate + LocalTime
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        String strDT = "2001-01-15T08:15:45";
        LocalDateTime parseDT = LocalDateTime.parse(strDT);
        System.out.println("parseDT: " + parseDT);

        System.out.println("\n=====ZonedDateTime=====\n");
        // ZonedDateTime - представляет дата и время в определенном часовом поясе

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime:" + zonedDateTime);
        System.out.println(zonedDateTime.getZone());

        System.out.println("\n=====isAfter, isBefore, until,equals=====\n");

        //  isAfter, isBefore, until,equals  есть у всех объектов представляющих дату и/или время

        LocalDate date3 = LocalDate.of(2020, 10, 15);
        LocalDate date4 = LocalDate.of(2020, 6, 25);

        // isAfter - проверяет, что текущий объект после (позже) указанного объекта
        boolean isAfter = date3.isAfter(date4);// проверяет, что текущий объект после (позже) указанного объекта
        System.out.println("date3.isAfter(date4):" + isAfter);// проверяет, что текущий объект после (позже) указанного объекта

        // isBefore - проверяет, что текущий объект до (раньше) указанного объекта
        System.out.println("date3.isBefore(date4):" + date3.isBefore(date4));

        // equals - проверяет даты/время на равенство
        System.out.println("date3.isEqual(date4):" + date3.isEqual(date4));
        System.out.println("date3.equals(date4):" + date3.equals(date4));

        // until - метод измеряет разницу между текущим и указанным объектом даты / времени -> long
        long between = date3.until(date4, ChronoUnit.DAYS);// возвращает количество дней между датами
        System.out.println("between:" + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.now().minusDays(15);
        System.out.println(dateTime1.until(dateTime2, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.minus(5, ChronoUnit.HOURS);
        System.out.println(dateTime3);
        System.out.println(dateTime1.plus(5, ChronoUnit.YEARS));

        System.out.println("\n=====Duration, Period,Instant");

        // Классы Duration, Period оба представляют собой отрезки времени.
        // Но используются для разных типов временных сущностей.
        // Duration - продолжительность времени (часы, минуты, секунды)
        // Period - для долгосрочных отрезков времени: дни, месяцы, годы

        LocalTime start = LocalTime.of(10, 30);
        LocalTime end = LocalTime.of(12, 45);

        // Разница между временами
        Duration duration = Duration.between(start, end);
        System.out.println("duration:" + duration);
        long milis = duration.toMillis();
        System.out.println("milis:" + milis);
        long second = duration.toSeconds();
        System.out.println("seconds:" + second);
        System.out.println(duration.getSeconds());

        /*
        toDays(), toHours(), toMinutes(), toSeconds(), toMillis(), toNanos()
        возвращает количество дней, часов, минут, секунд, миллисекунд и наносекунд
         */

        // Instant - представляет собой точку на временной шкале в Григорианском календаре
        // сколько прошло миллисекунд с 1 января 1970 UTC
        Instant instant = Instant.now();
        System.out.println("instant:" + instant.getEpochSecond());

        System.out.println("\n=====DateTimeFormatter===========");
        // DateTimeFormatter форматирование и парсинг даты и времени.
        // Позволяет создавать форматированные строки из дат/времени. А также обратно парсить строки в объекты дат / времени


        LocalDateTime now = LocalDateTime.now();
        System.out.println("now:" + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        String formattedDate = now.format(formatter);

        System.out.println("formattedDate:" + formattedDate);

        /*
        y - год
        M - месяц
        d - день
        H - час в 24-часовом формате
        h - час в 12-часовом формате, a - AM/PM (до/после полудня)
        m - минута
        s - секунда
        остальные символы в шаблоне - отображаются как есть

        количество повторений символа определяет формат отображения unit
        yy - год в 2-х цифрах (00-99)
        yyyy - год в 4-х цифрах (0000-9999)
        M - месяц
        MM - месяц в 2-х цифрах (01-12)
        MMM - месяц в трех буквах (Jan-Dec)
        MMMM - месяц в полном названии (January-December)
        d - день (1-31)
        dd - день в 2-х цифрах (01-31)
         */

        String dateForParse = "2023-10-26 19:15";
        System.out.println("stringWithDate:" + dateForParse);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parseLocalDateTime = LocalDateTime.parse(dateForParse, formatter1);

        System.out.println(parseLocalDateTime.getDayOfWeek() + "|" + parseLocalDateTime.getHour());




        /*
        15-12-2022 20-46
        Запарсить строку в формат LocalDateTime.
        Распечатать отдельно месяц, день, час объекта LDT

        13-01-2023 00-47
        Какому днб недели соответствует вторая дата
        Сколько дней между этими двумя датами

         */


    }
}
