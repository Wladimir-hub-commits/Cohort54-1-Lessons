package hwk_23S.shapes;

public class TriangleSingle extends Shape{
    private double a;
    private double b;
    private double c;

//    private static TriangleSingle instance;

    private TriangleSingle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static TriangleSingle getInstance(double a, double b, double c) {
        if (isValidSides(a, b, c)) {
            // Могу составить треугольник
            return new TriangleSingle(a, b, c);
        } else {
            System.out.println("Invalid sides!");
            return null;
        }
    }


    private static boolean isValidSides(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "TriangleSingle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
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
