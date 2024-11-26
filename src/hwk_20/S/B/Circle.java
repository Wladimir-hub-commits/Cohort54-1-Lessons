package hwk_20.S.B;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */

/*
Класс Circle (Круг)
• Создайте класс Circle, который наследуется от Shape.
• Добавьте поле radius типа double, которое хранит радиус круга.
• Создайте метод setRadius(double radius), который устанавливает значение поля radius.
• Создайте метод calculateArea(), который вычисляет и выводит площадь круга.

 */

public class Circle extends Shape{
    private double radius;
    public static final double PI = 3.14159;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double calculateArea(){
        double area = radius * radius * PI;
        System.out.println("The area of the circle is:" + area);
        return  area;


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
