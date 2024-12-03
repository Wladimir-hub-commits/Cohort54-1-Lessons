package hwk_23.Shape;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    /*
    Класс Rectangle:

    Реализует методы для вычисления площади и периметра
    прямоугольника.

     */
}

