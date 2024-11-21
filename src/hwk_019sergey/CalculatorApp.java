package hwk_019sergey;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */

public class CalculatorApp {


    public static void main(String[] args) {

        System.out.println(Calculator_19.PI);
        // константа Пи уже есть в классе Math
        System.out.println(Math.PI);

        double radius = 10.6;
        double area = Calculator_19.circleArea(radius);

        System.out.println("area: " + area);

        System.out.println("Perimeter: " + Calculator_19.circlePerimeter(radius));
    }

}
