package lesson_27;

import list.MyArrayList;
import list.MyList;

import java.util.Iterator;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public class ForEachExample {
    public static void main(String[] args) {

        MyList<String> list = new  MyArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);

        }
        while (iterator.hasNext()){
            String str = iterator.next();

        }

        /*
        // Цикл forEach - ещё его называют синтаксический сахар

        Цикл forEach предназначен для перебора коллекций
        коллекция - это то, что мы перебираем

        for (Тип Переменной переменная : коллекция){
        // Действия с переменной

        }
         */

        System.out.println("\n=============\n");
        /*
        String -переменная
        str - название переменной
        list - список (коллекция)
         */
        for (String str : list) {
            System.out.println(str);

        }

        System.out.println("\n==============\n");
        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1,3,5,7,1,9,11,13);

        for (Integer element : integers){
            System.out.println(element + 100);

        }
    }
}
