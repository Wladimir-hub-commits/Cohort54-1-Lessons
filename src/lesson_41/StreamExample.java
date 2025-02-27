package lesson_41;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author Waldemar Ilz
 * {code data} 25.02.2025
 */

public class StreamExample {

     /*
    Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле

    Stream (поток) - поток данных представляет собой последовательность элементов.
    Поток дает возможность поочередного получение элемента данных для обработки.
    Стримы могут быть созданы из различных источников (коллекции, массивы и так далее)

    Pipeline - последовательно операций, выполняемых на потоке

    Промежуточные операции (методы) - Это операции, которые преобразуют поток в другой поток (возвращают поток).
    Их может быть много (больше чем одна)

    Терминальные операции (методы) - Это операции, которые запускают обработку потока и закрывают его.
    После выполнения терминальной операции поток перестает быть доступным для дальнейшей обработки.
    Может быть ТОЛЬКО ОДИН терминальный метод

    Ленивые вычисления
    Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.





     */


    /*
    Промежуточные методы:

    Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы,
    для которых предикат вернет true
    Т.е. Оставляет элементы, удовлетворяющие условию (отбрасывает элементы НЕ удовлетворяющие условию)

    sorted() - сортирует поток в естественном порядке
    sorted(Comparator<T> comparator> - сортирует элементы с использованием компаратора

    Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
    в том числе в другой тип данных

    Stream<T> peek(Consumer<T> action) - выполняет действие для каждого элемента потока. Как правило, не изменяющее элемент

     */

    /*
    Терминальные методы

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций или другие структуры данных.

    void forEach(Consumer<T> action) - выполняет заданное действие для каждого элемента потока

     */


    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//            task7();
        task8();


    } // Methods area

    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, null, cat2, cat3, new Cat(null, 10, "red")};

        // Получить список кошек, имя которых длиннее 4 символов

        // Arrays.stream(cats) - создает поток из элементов массива

        List<Cat> longCats = Arrays.stream(cats)
//                .filter(c -> c != null) // оставить в потоке только не null
//                .filter(c -> Objects.nonNull(c)) // оставить не null значения
                .filter(Objects::nonNull) // оставить не null значения
                .filter(c -> Objects.nonNull(c.getName())) // проверка какого-то поля на null
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());

//        Objects.isNull(null); // вернет true, если параметр null
//        Objects.nonNull(null); // вернет true, если параметр НЕ null

        System.out.println(longCats);


    }

    private static void task7() {
        List<Cat> cats = getListCats();

        // Вывести на экран имена котов, чей вес меньше 5 кг.
        // Вывести на экран котов, после фильтрации

        Stream<String> catStream = cats.stream()
                .filter(c -> c.getWeight() < 5)
                .peek(cat -> System.out.println("After filter:" + cat))
                .map(cat -> cat.getName());
        /*
        peek - промежуточный метод. Используется в основном для отладки. Не прерывает поток.
        forEach - терминальный метод. Для выполнения действия с каждым элементов потока. Закрывает поток
         */

        catStream.forEach(name -> System.out.println(name));
//        catStream.forEach(System.out::println);

    }

    private static void task6() {
        // Получить список имен кошек, у которых имена короче 5 символов

        List<Cat> cats = getListCats();

        /*
        классически - методы фильтрации должны выполнятся в потоке как можно раньше
        Эффективность
         */
        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names1);

        /*
        Читаемость, понимание кода
         */
        System.out.println("\n=====================");
        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println(names2);


    }

    private static void task5() {
        List<Cat> cats = getListCats();

        /*
        Получить список имен кошек, чей вес больше 4
        Создать поток
        Оставить кошек, чей вес больше 4
        Изменить тип потока Cat -> name (String)
        Собрать в список
        */

        List<String> names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
//                .map(cat -> cat.getName())
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names);

    }

    private static void task4() {
        List<Cat> cats = getListCats();

        // Получить список имен всех кошек

        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

//        List<String> listName = new ArrayList<>();
//        for (Cat cat : cats) {
//            listName.add(cat.getName());
//        }

        System.out.println("names: " + catNames);

        // Изначальная коллекция не изменяется
        System.out.println(cats);
    }

    private static void task3() {
        List<Cat> cats = getListCats();

        // Оставить котов с именем, длиннее 4 символов
        Stream<Cat> stream = cats.stream()
                .filter(c -> c.getName().length() > 4);

        // Пока не запущен терминальный метод - промежуточные методы не выполняются
        List<Cat> longNames = stream.collect(Collectors.toList());

        System.out.println("longNames: " + longNames);
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // список кошек с весом больше 4
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());
//        List<Cat> fatCats = catStream.toList(); // Java 17 or higher  .collect(Collectors.toList() = .toList()

        // Повторно использовать "закрытый" поток нельзя. Закрытый - на котором уже был вызван терминальный метод.
        // List<Cat> fatCats2 = catStream.sorted().collect(Collectors.toList()); // - будет ошибка (исключение)

        System.out.println(fatCats);

    }


    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }


    public static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // Получить список, содержащий все положительные числа из исходного списка
        // Список должен быть отсортирован в порядке возрастания


        List<Integer> result = new ArrayList<>();

        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }

        result.sort(Comparator.naturalOrder());

        System.out.println("result: " + result);

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекции.

        List<Integer> integerList = integers.stream() // создание потока из элементов коллекции List
                .filter(num -> num > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List

        System.out.println("integerList: " + integerList);

        // Pipeline
        //integers.stream().filter(num -> num > 0)


    }


}

