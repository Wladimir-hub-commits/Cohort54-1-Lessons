package hwk_23S.shapes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

        if (!isValidSides()) {
            // Невозможно составить треугольник?
            System.out.println("Invalid sides");
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }
    }

    private boolean isValidSides() {
        return a < b + c && b < a + c && c < a + b;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    double area() {
        double area;
        double p2 = perimeter() / 2;
        area = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
        return area;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}