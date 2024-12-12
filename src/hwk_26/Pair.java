package hwk_26;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public class Pair <T>{
    private T first;
    private T second;

    // Конструктор, принимающий два параметра типа T
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Метод для получения первого элемента
    public T getFirst() {
        return first;
    }

    // Метод для получения второго элемента
    public T getSecond() {
        return second;
    }

    // Метод для установки значения первого элемента
    public void setFirst(T value) {
        this.first = value;
    }

    // Метод для установки значения второго элемента
    public void setSecond(T value) {
        this.second = value;
    }

    // Метод для обмена местами первого и второго элементов
    public void swap(){
        T temp = first;
        first  = second;
        second = temp;

    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
