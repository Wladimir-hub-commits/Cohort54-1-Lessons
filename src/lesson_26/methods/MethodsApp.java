package lesson_26.methods;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

import list.MyArrayList;
import list.MyList;

import java.util.Arrays;


public class MethodsApp {

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        String[] strings = {"a", "b", "c", "d"};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        String str = UtilsGeneric.printArray(integers);
        System.out.println(str);

        String str1 = UtilsGeneric.printArray(strings);
        System.out.println(str1);

        String str2 = UtilsGeneric.printArray(doubles);
        System.out.println(str2);

        System.out.println("\n ====================== \n");
        UtilsGeneric.swap(doubles, 0, 3);
        System.out.println(UtilsGeneric.printArray(doubles));

        double sum = UtilsGeneric.sum(integers);
        System.out.println(sum);

        sum = UtilsGeneric.sum(doubles);
        System.out.println(sum);

        System.out.println("\n ====================== \n");

        MyList<Integer> integerMyList = new MyArrayList<>();
        integerMyList.addAll(1, 2, 3, 4, 5);
        double sumInt = UtilsGeneric.listSum(integerMyList);

        System.out.println("sumInt: " + sumInt);

        MyList<String> stringMyList = new MyArrayList<>();
        // Ошибка компиляции
        // sumInt = UtilsGeneric.listSum(stringMyList);

        MyList<Double> doubleMyList = new MyArrayList<>();

        UtilsGeneric.addNumbers(integerMyList);
        System.out.println(integerMyList);




    }

}
