package hwk_36.Task_1;

/**
 * Author Waldemar Ilz
 * {code data} 08.02.2025
 */

import java.util.Comparator;

public class ScoreSportsmanComparator implements Comparator<Sportsman> {


    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Double.compare(s1.getScore(), s2.getScore()); // Сравнение по рейтингу
    }
}





