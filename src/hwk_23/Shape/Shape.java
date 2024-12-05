package hwk_23.Shape;

/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */

/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами
для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь
 и периметр всех фигур в массиве.
 */

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();

}
/*
Абстрактный класс Shape:

Содержит два абстрактных метода: area() и perimeter(),
которые должны быть реализованы в наследниках.
 */