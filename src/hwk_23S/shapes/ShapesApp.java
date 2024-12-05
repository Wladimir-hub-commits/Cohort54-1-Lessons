package hwk_23S.shapes;

import hwk_23.Shape.Triangle;

/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */


/*
Task 1

Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.

Реализуйте классы-наследники Circle, Rectangle, и Triangle.

Убедитесь, что все классы правильно вычисляют площадь и периметр.

Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.

 */

public class ShapesApp {
    public static void main(String[] args) {

        Circle circle = new Circle(4.5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println("==================\n");

        Rectangle rectangle = new Rectangle(3.5, 4.5);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        System.out.println("==================\n");

        Triangle triangle = new Triangle(3.5, 4.5, 3.5);
        System.out.println(triangle);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        System.out.println("==================\n");

        Triangle wrongTriangle = new Triangle(3, 4, 8);
        System.out.println(wrongTriangle);

//        Shape[] shapes = new Shape[3];
//        shapes[0] = circle;
//        shapes[1] = rectangle;
//        shapes[2] = triangle;

        Shape[] shapes = {circle, rectangle,};
        double totalArea = 0;
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].area();
            totalPerimeter += shapes[i].perimeter();
        }

        System.out.println("totalArea: " + totalArea);
        System.out.println("totalPerimeter: " + totalPerimeter);


        System.out.println("\n====================\n");
//        TriangleSingle triangleSingle = TriangleSingle.getInstance();
//        TriangleSingle triangleSingle2 = TriangleSingle.getInstance();
//
//        System.out.println(triangleSingle == triangleSingle2);

        TriangleSingle triangleS = TriangleSingle.getInstance(3,4, 8);
        System.out.println(triangleS);

        triangleS = TriangleSingle.getInstance(4, 6, 4);
        System.out.println(triangleS);
        System.out.println(triangleS.area());
        System.out.println(triangleS.perimeter());




    }
}
