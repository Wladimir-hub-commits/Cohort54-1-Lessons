package lesson_26;

import java.util.Map;


/**
 * Author Waldemar Ilz
 * {code data} 10.12.2024
 */

public class GenExample<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public GenExample(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenExample{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }


    public static void main(String[] args) {
        GenExample<Integer, String> genExample =
                new GenExample<>(100, "String");

        System.out.println(genExample);

        GenExample<String, String> stringGenExample =
                new GenExample<>("Java", "Hello");
    }


}
