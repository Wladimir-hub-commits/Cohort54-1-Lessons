package lesson_25.generics;

public class Wrappers {
    public static void main(String[] args) {

        // Классы-обертки используются в Java для представления примитивных типов данных как объектов (ссылочных типов данных)

        /*
        Byte - обертка для byte
        Short - обертка для short
        Integer - обертка для int
        Long - обертка для long
        Double - обертка для double
        Float - обертка для float
        Character - обертка для char
        Boolean - обертка для boolean
         */

        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // Авто упаковка примитива int в ссылочный Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Авто распаковка. Из типа Integer автоматически преобразовало значение в примитив int
        System.out.println(primitiveInt);

        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        System.out.println(Integer.MIN_VALUE);

        // Особенности сравнения классов-оберток
        Integer a = 127;
        Integer b = 127;
        System.out.println("127 == 127: "+  (a == b)); // true
        System.out.println(127 + ".equals(" + 127 + "): " + a .equals(b)); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println("128 == 128: "+  (c == d)); //false
        System.out.println(128 + ".equals(" + 128 + "): " + c.equals(d)); // true

        Integer c1 = -128;
        Integer d1 = -128;
        System.out.println("-128 == -128: "+  (c1 == d1)); //true

        // Все числа в этом диапазоне -128 до 127 используется кеширование объектов.

        // Для гарантированного правильного сравнения оберточных типов
        // нужно использовать equals()


        //
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("str1 == str2: "+  (str1 == str2));

        System.out.println("\n ==================== \n");

        // Общие (или схожие) методы, которыми обладают классы-обертки

        // 1. valueOf() - Упаковка. преобразует строку или примитив в соответсвующий объект класса-обертки
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf("127");
        System.out.println(e == f);

        Double dbl = Double.valueOf("154.5");
        System.out.println(dbl + 1);

        // 2. parseXXX() - преобразует строку в соответсвующий примитив
        int i1 = Integer.parseInt("300")  + 1;
        System.out.println(i1);
        double d2 = Double.parseDouble("344.56");
        System.out.println(d2 + 200);

//        System.out.println(Integer.parseInt("Rrrr")); // если не получится извлечь значение - будет выброшено исключение (ошибка)
//        System.out.println(Integer.valueOf("Rrrr")); // если не получится извлечь значение - будет выброшено исключение (ошибка)

        // 3. toString() - возвращает строковое представление значения
        String strNumber = dbl.toString();
        System.out.println(strNumber + 10); // 154.510 - конкатенация строк, а не операция сложения

        // 4. equals - сравнивает два объекта по значению

        // 5. xxxValue() Распаковка. Возвращает значение объекта как примитивный тип
        Double dbl2 = Double.valueOf(125.67); // Явная / принудительная упаковка
        double dPrimitive = dbl2.doubleValue(); // Явная / принудительная распаковка

        // Все числовые обертки наследуются от абстрактного класса Number
        // Byte, Short, Integer, Long, Double, Float

        /*
        byteValue();
        shortValue();
        intValue();
        longValue();
        floatValue();
        doubleValue();
         */

        Integer integer = 31844;

        System.out.println(integer.doubleValue());

        short sh = integer.shortValue();
        System.out.println(sh);

        double sum = add(1455343, 344.67);
        System.out.println(sum);


        // Переполнение диапазона (также как в примитиве)
        Integer a1 = Integer.MAX_VALUE;
        Integer b1 = 1000;
        a1 += b1;
        System.out.println(a1);


    }

    public static double add(Number number1, Number number2) {
        double d1 = number1.doubleValue();
        double d2 = number2.doubleValue();
        return d1 + d2;
    }
}

