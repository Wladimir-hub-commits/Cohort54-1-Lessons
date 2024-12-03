package hwk_23.Shape;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 4, 5);

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.area();
            totalPerimeter += shape.perimeter();
        }

        System.out.println("Общая площадь: " + totalArea);
        System.out.println("Общий периметр: " + totalPerimeter);
    }

/*
Класс Main:

В методе main создается массив фигур и вычисляются общая площадь и периметр всех фигур в массиве.
 Результаты выводятся на экран.
 */
}

