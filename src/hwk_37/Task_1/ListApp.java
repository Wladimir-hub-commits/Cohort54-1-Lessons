package hwk_37.Task_1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static hwk_37.Task_1.ListIntersection.intersect;

/**
 * Author Waldemar Ilz
 * {code data} 13.02.2025
 */

public class ListApp {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 3));
        List<Integer> integers1 = new LinkedList<>(List.of(3, 4, 4, 5, 5, 6, 7, 8));

        List<Integer> result = intersect(integers, integers1);
        System.out.println(result);
        System.out.println(intersect(integers1, integers));


        System.out.println("\n ========Alternatve=================== \n");

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.addAll(List.of(15, 24, 48, 32, 16, 85, 16, 38, 24, 100));
        list2.addAll(List.of(85, 16, 38, 24, 100));

        System.out.println("list1: " + list1);
        System.out.println("\n ==================== \n");
        System.out.println("list2: " + list2);
        list1.retainAll(list2);
        System.out.println("\n ==================== \n");
        System.out.println(intersect(list1, list2));

    }
}
