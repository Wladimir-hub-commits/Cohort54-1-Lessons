package hwk_22.Vehicle;

public class VehicleApp {
    public static void main(String[] args) {
        // Создаем массив транспортных средств
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        // Используем полиморфизм для вызова метода startEngine()
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }

    }
}
