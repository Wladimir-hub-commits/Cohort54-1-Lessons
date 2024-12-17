package lesson_27.enums.colors;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public class AutoApp {
    public static void main(String[] args) {

        Color red = Color.RED;

        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(red);
        System.out.println(auto);

        System.out.println("\n===========\n");

        // Возвращает массив значений
        Color[] colors = Color.values();

        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }

        // Возвращает enum по строковому имени
        Color color1 = Color.valueOf("RED");
        System.out.println("color1: " + color1);

        // Получить имя константы (строку)
        String name = Color.GREEN.name();
        System.out.println("name: " + name.toLowerCase());

        // Получить порядковый номер константы (начиная с нуля 0)
        int original = Color.BLUE.ordinal();
        System.out.println("original: " + original);

        System.out.println("\n=====================\n");

        switch (auto.getColor()) {
            case RED:
                System.out.println("Цвет машины красный");
                break;
            case BLUE:
                System.out.println("Цвет машины синий");
                break;
            case GREEN:
                System.out.println("Цвет машины зелёный");
            default:
                System.out.println("Какой-то другой цвет");


        }
        System.out.println("\n=================\n");
        // Enum безопасно сравнивать на равенство оператором ==

        auto.setColor(Color.BLUE);
        if (auto.getColor() == Color.BLUE){
            System.out.println("Цвет машины синий");
        }else {
            System.out.println("Не синий");
        }


    }
}