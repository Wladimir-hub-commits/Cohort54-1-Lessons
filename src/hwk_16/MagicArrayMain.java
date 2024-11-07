package hwk_16;

/**
 * Author Waldemar Ilz
 *{code data} 06.11.2024
 */

public class MagicArrayMain {

    public static void main(String[] args) {
        // Пример использования MagicArray
        MagicArray magicArray = new MagicArray();

        magicArray.add(1);
        magicArray.add(2);
        magicArray.add(3);
        magicArray.printAll();

        System.out.println(magicArray.indexOf(2));

        magicArray.remove(1);
        magicArray.printAll();

        magicArray.addAll(4, 5, 6);
        magicArray.printAll();

        magicArray.removeByValue(3);
        magicArray.printAll();

        System.out.println(magicArray.get(0));
        System.out.println("Текущее количество элементов: " + magicArray.currentSize()); // Вывод: 4
    }
}
