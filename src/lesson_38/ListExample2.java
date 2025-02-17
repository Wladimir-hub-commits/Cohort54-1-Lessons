package lesson_38;

/**
 * Author Waldemar Ilz
 * {code data} 13.02.2025
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 10, 100, -5, 6, 100, 11, 54));

        // Поиск элемента по значению - возвращает индекс
        // int indexOf(Object obj) - Первое вхождение элемента в списке
        //int lastIndexOf (Object obj) - Последнее вхождение элемента в списке

        System.out.println("list.indexOf(100): " + list.indexOf(100));
        System.out.println("list.lastIndexOf(100): " + list.lastIndexOf(100));
        System.out.println("list.indexOf(-10000): " + list.lastIndexOf(-10000));
        System.out.println("list.indexOf(\"String\"): " + list.indexOf("String"));

        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора

        list.sort((i1, i2) -> Integer.compare(i2, i1));

        System.out.println(list);

        list.sort(Integer::compare);

        list.sort(Comparator.naturalOrder());

        list.sort(Comparator.reverseOrder());

        System.out.println(list);

        // List<E> subList(int fromIndex, int toIndex) - возвращает список из  элементов,
        // находящихся между индексами fromIndex (включительно) и toIndex (не включительно).
        List<Integer> subList = list.subList(1, 5);
        System.out.println("list.subList(1, 5): " + subList);

    }
}
