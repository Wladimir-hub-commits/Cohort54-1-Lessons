package hwk_37.Task_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author Waldemar Ilz
 * {code data} 13.02.2025
 */
/*
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */
public class ListIntersection  {
    public static <T> List<T> intersect(List<T> list1, List<T> list2) {

        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
}