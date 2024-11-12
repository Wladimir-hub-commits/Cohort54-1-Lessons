package lesson_17;
/**
 * Author Waldemar Ilz
 *{code data} 07.11.2024
 */

public class ArrayApp {
    public static void main(String[] args) {

        int[] ints = {10, 20, 50, -25, 35, 45, 100, -1, 50};

        MagicArray17 magicArray = new MagicArray17(ints);

        System.out.println(magicArray.toString());

        System.out.println(magicArray.indexOf(10));
        System.out.println("magicArray.indexOf(500): " + magicArray.indexOf(500));

        System.out.println("magicArray.removeByValue(20): " + magicArray.removeByValue(20));

        // Обновление значение по несуществующему индексу
        System.out.println(magicArray.set(100, 1000));

        System.out.println(magicArray.toString());

        System.out.println("magicArray.set(0, 1000): " + magicArray.set(0, 1000));

        System.out.println(magicArray.toString());



    }

}
