package lesson_37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        // Inteface Collection
        //

        // Collection
        //
        //
        Collection<String> strings = new java.util.ArrayList<>();

        // int size = strings.size();

        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty = strings.isEmpty();
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

       // boolean add = strings.add("Java");
        strings.add("Java");
        strings.add("strings.add(\"Python\")"); // strings.add("Python");

        //

        System.out.println(strings);

        // method.of -
        //
        //

        Collection<Integer> integers = List.of(0,1, 2, 3, 4, 5);

        System.out.println("integers: " + integers);
        //
        //
        strings.addAll(List.of("Java", "Python", "JS"));

        System.out.println( strings);

        System.out.println("\n==============================\n");

        // remove
        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0,1, 2, 3, 4, 5));

        System.out.println("numbers: " + numbers);
        numbers.removeAll(List.of(3,2,1));

        System.out.println("numbers.removeAll(List.of(3,2,1)): " + numbers);

        //
        //
        //
        //
        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colb = new ArrayList<>();

        colA.addAll(List.of(10, 20, 30, 40, 50));
        colb.addAll(List.of( 20, 30, 40));

        System.out.println("colA: " + colA);
        System.out.println("colb: " + colb);

        colA.retainAll(colb);

        System.out.println("colA.retainAll(colb): " + colA);

        //
        //
        //
        System.out.println("colA.removeAll(100): " + colA.removeAll(Collections.singleton(100)));
        System.out.println("ColA.removeAll(20): " + colA.removeAll(Collections.singleton(20)));
        System.out.println("colA: " + colA);
        colA.clear();
        System.out.println("colA" + colA);

    }
}
