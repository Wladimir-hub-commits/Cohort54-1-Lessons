package lesson_40;

/**
 * Author Waldemar Ilz
 * {code data} 20.02.2025
 */

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(8, "white");
        map.put(100, "black");
        map.put(17, "orange");
        map.put(7, "red");

        System.out.println(map);

        // 1. Метод Collection <V> values()
        // Collection <V> values() - возвращает коллекцию всехзначений

        Collection<String> values = map.values();
        System.out.println("map.values(): " + values);

        // 2.Метод Set <K> keySet()
        // Set <K> keySet() - возвращает Set, содержащий  из всех ключей карты

        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);
        // могу перебрать ключи в цикле и получить все значения
        for (Integer key : keys) {
            System.out.println(map.get(key) + ";");

        }
        System.out.println();

        // Фокус. "Живая связь".
        // Метод keySet и values возвращает представления (views) соответствующих ключей и значений карты.
        // Это представление поддерживается самой картой, что означает, что они напрямую связаны с внутренними данными HashMap()
        // Поэтому любые изменения, внесенные в эти представления, отражаются на исходной карте
        // Причем связь эта двусторонняя
        keys.remove(17);
        System.out.println("map.keySet(): " + keys);
        System.out.println("map: " + map);
        System.out.println("values: " + values);
        values.remove("green");
        map.remove(16);
        System.out.println("\n ==== values.remove(\"green\") ====");
        System.out.println("map.keySet(): " + keys);
        System.out.println("map: " + map);
        System.out.println("values: " + values);
        System.out.println("\n ==============");
        values.removeAll(List.of("red"));
        System.out.println("values : " + values);
        System.out.println("map" + map);

        System.out.println("\n ==============");

        Set<Integer> newKeys = new HashSet<>(keys);
        System.out.println("newKeys: " + newKeys);
        newKeys.remove(0);
        newKeys.remove(100);
        System.out.println("newKeys: " + newKeys);
        System.out.println("keys: " + keys);

        System.out.println("\n ==============Map.Entry");

        // Для перебора пар ключ-значение
        // Entry Вложенный interface который  содержит пару ключ-значение
        // Set<Map.Entry<K, V>> entrySet() - возвращает set входящий всех пар ключ-значение
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print("entry.getKey(): " + entry.getKey() + "; ");
            System.out.print("entry: " + entry +"->");
            System.out.println("entry.getValue(): " + entry.getValue());
        }

        // Тоже "живая связь"
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(100)) {
                entry.setValue("JAVA!");
            }
        }
        System.out.println();
        System.out.println("map: " + map);

        System.out.println("\n =======put vs replace =======\n");
        System.out.println(map.put(11, "orange")); //put - если ключа нет - новая пара key-value добавилась
        System.out.println(map.put(11, "green")); //  put - если ключ есть - значение будет перезаписано

        // replace(K key, V value) - если такого ключа нет, новая пара НЕ создается
        // Если ключ есть - значение будет перезаписано

        System.out.println(map.replace(200, "red")); // replace - ключа нет - нова пара НЕ добавилась
        System.out.println(map.replace(15, "red")); // replace - если ключ есть - значение будет перезаписано
        System.out.println("map: " + map);

        System.out.println("\n ============================== \n");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            // могу с ними что-то делать
        }

        // Перебор всех пар ключ-значение с возможностью применить к ним какую-то функцию
       // map.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));
        map.forEach((k,v) -> System.out.println(k + "=" + v));


        System.out.println("\n======== Option 2 - многострочное действие ==== ");

        map.forEach((key, value) -> {
            System.out.println("Iteration: ");
            System.out.println("Key: " + key + " | Value: " + value);
            System.out.println("====================\n");
        });



    }
}
