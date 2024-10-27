package hwk_04;

/**
 * @author Waldemar Ilz
 * {@code date} 23.09.2024
 */
/*
Неявное преобразование int в double
Напишите программу, которая:

1.Объявляет переменную типа int и присваивает ей значение 10.
2.Присваивает значение этой переменной в переменную типа double с именем myDouble.
3.Выводит значение myDouble на экран.

Ожидаемый результат:Значение myDouble: 10.0
 */
public class Task_01 {
    public static void main(String[] args) {

        int myInt = 10;
        double myDouble;
        myDouble = myInt;
        System.out.println("myDouble:" + myDouble);


    }
}
