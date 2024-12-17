package lesson_27.enums.days;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public enum Day {

    //Поле является типом данных от Объекта Day
    MONDAY("Понедельник",1),
    TUESDAY("Вторник",2),
    WEDNESDAY("Среда",3),
    THURSDAY("Четверг",4),
    FRIDAY("Пятница",5),
    SATURDAY("Суббота",6),
    SUNDAY("Воскресенье",7);

    private String russianName;
    private int dayNumber;

    public String testMethod(){
        return  String.format("%s - русский перевод: %s; номер для недели: %d",
                this.name(), this.russianName, this.dayNumber);
    }

    Day(String russianName, int dayNumber) {
        this.russianName = russianName;
        this.dayNumber = dayNumber;
    }

    // Конструктор может быть перегружен
    Day(String russianName) {
        this.russianName = russianName;
        this.dayNumber = 7;
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
}
