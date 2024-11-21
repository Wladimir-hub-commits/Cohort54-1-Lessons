package lesson_20.transport;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */

public class Vehicle {
    // protected - в коде классов-наследниках мы будем иметь прямой доступ к этому полю
    protected String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Vehicle() {
        this.model = "Default";
        this.year = 2000;
    }

    public void start() {
        System.out.println(model + " начинает движение");
    }

    public void stop() {
        System.out.println(model + " останавливается");
    }

    public String toString() {
        return model + ", год выпуска: " + year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
