package lesson_26;



import list.MyArrayList;
import list.MyList;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);

        // Если не указать параметр типа, по умолчанию он будет Object
        MyArrayList arrayList2 = new MyArrayList<>();
        arrayList2.add("ggtghtrethr");

        MyList<Integer> numbers = new MyArrayList<>();
        numbers.addAll(1, 2, 3, 4, 5, 6);
        System.out.println(numbers);

        System.out.println("numbers.indexOf(5): " + numbers.indexOf(5));

        System.out.println(numbers.remove(0));
        System.out.println(numbers);
        System.out.println(numbers.remove(Integer.valueOf(2)));
        System.out.println(numbers);
        numbers.add(100);

        System.out.println("\n===================\n");
        MyList<String> strings = new MyArrayList<>();
        strings.add("Java");
        strings.addAll("Python", "C#", "Scala", "Kotlin");
        System.out.println(strings);

        System.out.println(strings.remove(2));
        System.out.println(strings.remove("Go"));
        System.out.println(strings.remove("Scala"));
        System.out.println(strings);

        System.out.println("\n==================\n");
        numbers.addAll(10, 20, 30, 40, 50, 60, 70, 80, 90);
        System.out.println(numbers);

        Integer[] array = numbers.toArray(); //
        System.out.println(Arrays.toString(array));

        System.out.println("\n========================\n");

        // Стирание типов в Java

        MyList<String> strings1 = new MyArrayList<>();
        strings1.add("Java");
        String value = strings1.get(0);
        System.out.println(value.toUpperCase());
        String[] arrayStr = strings1.toArray();
        System.out.println("arrayStr: " + Arrays.toString(arrayStr));

        Integer i1 = numbers.get(0);
        System.out.println(i1);


        MyList<Double> doubles = new MyArrayList<>();
        Double[] doubles1 = doubles.toArray();
        System.out.println("doubles: " + Arrays.toString(doubles1));



    }

    // Не считается перегруженным методом
//    public static void test(MyList<String> list) {
//
//    }
//
//    public static void test(MyList<Integer> list) {
//
//    }


}

