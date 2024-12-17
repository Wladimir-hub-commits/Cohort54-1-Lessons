package hwk_26;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

// Пример использования
public class PairApp {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello" , "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println(pair);

        System.out.println("\n====================\n");

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println(pair);
    }

    /*
    Объяснение кода:
Объявление класса: Класс Pair обобщенный, это означает, что он может
хранить два значения любого типа T.
Конструктор: Конструктор принимает два параметра типа T и
инициализирует поля first и second.

Методы доступа: Методы getFirst() и getSecond() возвращают
соответствующие значения.

Методы установки: Методы setFirst(T value) и setSecond(T value)
позволяют изменить значения первого и второго элемента.

Метод swap(): Этот метод меняет местами значения first и second.

Пример использования: В методе main создается экземпляр Pair,
 демонстрируется работа методов класса.

Вы можете использовать этот класс для хранения любых пар значений
одного типа.
     */
}
