package hwk_23.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    /*
    Класс Circle:

    Реализует методы для вычисления площади и периметра круга.

     */
}
