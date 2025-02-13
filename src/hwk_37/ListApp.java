package hwk_37;


import java.util.ArrayList;
import java.util.List;

/**
 * Author Waldemar Ilz
 * {code data} 13.02.2025
 */

public class ListApp {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.addAll(List.of(15,24,48,32,16,85,16,38,24,100));
        list2.addAll(List.of(85,16,38,24));

        System.out.println("list1: " + list1);
        System.out.println("\n ==================== \n");
        System.out.println("list2: " + list2);
        list1.retainAll(list2);
        System.out.println("\n ==================== \n");
        System.out.println(ListIntersection.intersect(list1, list2));

    }
}
