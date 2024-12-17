package lesson_26.methods;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

import list.MyList;

public class UtilsGeneric {

    // Метод, возвращающий строковое представление массива
    public static <T> String printArray(T[] array) {
        if (array == null || array.length ==0 ) return "[]";

        // input: {1, 2, 3, 4, 5, 6};
        // output: [1, 2, 3, 4, 5, 6]

        // [1, 2, 3, 4, 5, 6]
        // [2, 4, 6]
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(i < array.length - 1 ? ", " : "]");
        }
        return sb.toString();
    }

    // Метод, меняющий местами два элемента в массиве любого типа по индексам
    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }


    // Ограничение сверху Upper Bound
    // Написать метод, который считает сумму элементов в массиве
    // <T extends X> - тип T должен быть либо классом Х, либо его потомком

    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.doubleValue();
        }
        return sum;
    }

    public static <T extends Number> int sumInt(T[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.intValue();
        }
        return sum;
    }

    // MyList<? extends Number> - мы работаем с неизвестным типом, который является наследником Number
    // Метод, который принимает объект MyList только с элементами типа Number или его наследниками
    public static double listSum(MyList<? extends Number> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
        }
        return sum;
    }

    // Ограничения снизу (Lower Bounds)
    // <? super X> - Мы работаем с неизвестным типом, который является классом Х или его родителем (супер-классом)

    // Integer, Number, Object
    // Метод принимает MyList с элементами типа Integer или его предками
    public static void addNumbers(MyList<? super Integer> list){
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
    }
    /*
    PECS
    Producer Extends, Consumer Super
    Производитель, когда коллекция только поставляет данные (мы их читаем) - extend
    Потребитель, когда коллекция потребляет данные (мы их записываем) - super

    Extends - цель безопасно читать из нашего объекта
    Super - цель безопасно записывать в коллекцию
     */



}


