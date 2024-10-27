package hwk_04;


/**
 * @author Waldemar Ilz
 * {@code date} 23.09.2024
  */

/*
Потеря данных при преобразовании
Напишите программу, которая:

1.Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
2.Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
3.Выводит значение smallNumber на экран.
4.Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
 */

public class Task_03 {
    public static void main(String[] args) {

        long bigNumber = 15_000_000_000L;

        int smallNumber = (int) bigNumber;
        System.out.println("smallNumber:" + smallNumber);



    }


}
