package hwk_04;
/**
 * @author Waldemar Ilz
 * {@code date} 23.09.2024
 */
/*
Явное преобразование double в int
Напишите программу, которая:

1.Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
2.Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
3.Выводит значение myInt на экран.
Ожидаемый результат:

Значение myInt: 5
 */
public class Task_02 {
    public static void main(String[] args) {

        double myDouble = 5.99;
        int myInt = (int) myDouble ;

        System.out.println("myDouble:" + myDouble);
        System.out.println("myInt:" + myInt);


    }
}
