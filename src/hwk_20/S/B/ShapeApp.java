package hwk_20.S.B;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */

/*
Класс Main
• В методе main создайте объекты классов Rectangle и Circle.
• Установите значения для их полей с помощью соответствующих методов.
• Установите имя фигуры, используя поле name, унаследованное от класса Shape.
• Вызовите метод displayInfo() и методы вычисления площади для каждого объекта,
 */

public class ShapeApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Прямоугольник","Red");

        rectangle.setDimensions(5.5,7.43);

        rectangle.displayInfo();
        rectangle.calculateArea();

        Rectangle rectangle1 = new Rectangle("Rectangle","Yellow",10,20);
        rectangle.displayInfo();
        rectangle.calculateArea();


        System.out.println("Circle");

        Circle circle = new Circle("Circle","Blue",1);
        circle.setRadius(9.5);
        circle.calculateArea();


    }
}
