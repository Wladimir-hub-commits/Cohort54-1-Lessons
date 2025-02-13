package hwk_37;

import java.util.ArrayList;
import java.util.List;

/**
 * Author Waldemar Ilz
 * {code data} 13.02.2025
 */

public class ListIntersection {
    public static <T> List<T> intersect(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
}