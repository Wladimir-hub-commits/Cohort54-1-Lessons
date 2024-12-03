package lesson_23.Transport;

/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */

/*
Task 2
Создайте иерархию классов для разных типов транспортных средств:
Vehicle (родительский класс), Car, Bicycle и Motorcycle
 (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(),
 который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить
метод startEngine()
 для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов.
Используйте полиморфизм для вызова метода startEngine()
для каждого транспортного средства.
 */

public class TransportApp {
    public static void main(String[] args) {

        Car car = new Car(new Engine("Petrol",200));
        car.startEngine();
        car.startEngine();

        //
        //

    }


}
