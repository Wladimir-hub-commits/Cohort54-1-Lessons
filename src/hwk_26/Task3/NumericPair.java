package hwk_26.Task3;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

/*
Задача: Обобщенный класс с ограничениями типов

Описание:

Создайте обобщенный класс NumericPair, который хранит две
 переменные и имеет метод для вычисления их суммы.

Требования:

•	Класс должен иметь конструктор для инициализации двух чисел.
•	Метод double sum() возвращает сумму этих чисел.

 */

public class NumericPair<T extends Number, E extends Number> {
    private  T value1;
    private E value2;

    public NumericPair(T value1, E value2) {
       this.value1 = value1;
        this.value2 = value2;
    }


    @Override
    public String toString() {
        return "NumericPair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }

    public double sum(){
        return value1.doubleValue() + value2.doubleValue();
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public E getValue2() {
        return value2;
    }

    public void setValue2(E value2) {
        this.value2 = value2;
    }

    public static void main(String[] args) {
        NumericPair<Integer, Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        NumericPair<Double, Integer> doublePair = new NumericPair<>(5.5, 4);
        System.out.println(doublePair.sum()); // Вывод: 10.0
    }

}

