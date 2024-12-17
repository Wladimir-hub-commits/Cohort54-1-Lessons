package hwk_27.seasons;

/**
 * Author Waldemar Ilz
 * {code data} 14.12.2024
 */


/*
Реализуйте Enum для определения четырех времен года с методами,
 возвращающими среднюю температуру для каждого времени года.
 */

public enum Seasons {
    SPRING("Весна ", + 8.8 ),
    SUMMER("Лето ", + 19.2),
    AUTUMN("Осень ",+ 11.6),
    WINTER("Зима ", + 3.0);

    private String russianName;
    private double averageTemperature;

    public String seasonsMethod(){
        return String.format("%s - Русский перевод: %s; Средня температура времени года: %.1f°C%n ",
                this.name(), this.russianName, this.averageTemperature);
    }

    Seasons(String russianName, double averageTemperature) {
        this.russianName = russianName;
        this.averageTemperature = averageTemperature;
    }

    Seasons(String russianName) {
        this.russianName = russianName;
        this.averageTemperature = 4;
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}
