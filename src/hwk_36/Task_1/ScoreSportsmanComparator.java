package hwk_36.Task_1;

/**
 * Author Waldemar Ilz
 * {code data} 08.02.2025
 */

import java.util.Comparator;

public class ScoreSportsmanComparator implements Comparator<Sportsman> {

/*
Не правильный вариант

// Два спортсмена s1 10.5 vs s2 10.4
// s2, s1
// Такая реализация будет работать не верно, при разнице очков меньше 1

    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return (int)(s1.getScore() - s2.getScore());
        // int () - приводит к типу int 0.1 -> 0
        // Здесь будут два спортсмена кастированные в int и будут считаться равными, это не верно.

    }
 */
    // Чьо бы этого избежать надо использовать сравнение в обёрточном классе (в нашем случае это Double)
    // Правильный вариант
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Double.compare(s1.getScore(), s2.getScore()); // Сравнение по рейтингу
    }
}





