package hwk_20.S.B;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */
/*

Класс Rectangle (Прямоугольник)
• Создайте класс Rectangle, который наследуется от Shape.
• Добавьте поля width и height типа double, которые хранят размеры прямоугольника.
• Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height.
• Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.

 */
public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name, String color) {
        super(name, color);
    }

    public Rectangle(String name, String color, double height, double width) {
        super(name, color);
        this.height = height;
        this.width = width;
    }
    public void  setDimensions(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double calculateArea(){
        double area = width * height;
        System.out.println("Area is:" + area);
        return area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
