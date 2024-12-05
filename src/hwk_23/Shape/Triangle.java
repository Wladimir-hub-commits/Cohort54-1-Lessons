package hwk_23.Shape;

public class Triangle extends  Shape {
    private double  a ;
    private double  b ;
    private double  c ;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }


    @Override
    public double area() {
        double s = (a + b + c) / 2; // полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }

    /*
    Класс Rectangle:

    Реализует методы для вычисления площади и периметра
    прямоугольника.

     */
}




