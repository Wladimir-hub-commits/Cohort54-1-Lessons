package hwk_21.Task_02;

/**
 * Author Waldemar Ilz
 * {code data} 26.11.2024
 */

/*
Компьютер и компоненты
1. Создайте базовый класс Component с полями brand (бренд) и model (модель).
2. Создайте производные классы: Processor, Memory, Storage от класса Component.
3. Создайте класс Computer который будет содержать компоненты:
 процессор, память и накопитель.
4. Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory
 не могу существовать без компьютера.
 */

public class Component {

    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Component{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
