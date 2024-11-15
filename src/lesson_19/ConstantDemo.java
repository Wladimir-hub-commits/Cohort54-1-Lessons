package lesson_19;

/**
 * Author Waldemar Ilz
 *{code data} 14.11.2024
 */

public class ConstantDemo {

    public static final double PI = 3.141519; // Константа
    public static final int[] ints = new int[10]; // Не является константой, т.к. состояние объекта (значения в массиве) могут быть изменены
    public static final String COUNTRY = "Germany";
    public static final String[] colors = {"red", "blue", "yellow"}; // Не константа, т.к. значения в массиве можно перезаписать


    private final int x; // не константа. Т.к. значения переменно могут быть разными для разных объектов

    public ConstantDemo(int x) {
        this.x = x;
        colors[1] = "green";
    }

    public int getX() {
        return x;
    }

    public void showCountry() {
        System.out.println("My country is " + COUNTRY);
    }
}

