package lesson_37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {


        List<Integer> list= new ArrayList<>();
        list = new ArrayList<>(58);
        list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //
        list = new LinkedList<>();
        list = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }
}