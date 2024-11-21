package hwk_20;

public class ShapeApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.name = "Rectangle";
        rectangle.setDimensions(5, 3);
        rectangle.setColor("Red");
        rectangle.displayInfo();
        rectangle.calculateArea();

        Circle circle = new Circle();
        circle.name = "Circle";
        circle.setRadius(7);
        circle.setColor("Blue");
        circle.displayInfo();
        circle.calculateArea();

    }
}
