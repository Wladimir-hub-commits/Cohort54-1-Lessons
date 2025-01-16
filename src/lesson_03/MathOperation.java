package lesson_03;

//Author: Waldemar Ilz 17.09.2024




public class MathOperation {

    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        // Сложение "+"

        // Результат вычислений выражение в правой части присвается в переменную,указаннуюв левой части.
        result = var1 + var2;
        System.out.println("var1 + var2 = " + result );

        result = 15 + 6 + var1;
        // Закoментировать строку ctrl + /
        System.out.println("result + :" + result);

        //Вычитание "-"
        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        //  Умножеение "*"

        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

        //  Целочисленное деление "/"
        result = var1 / var2;
        // 20/7 -> 2 целые ив остатоке 6
        System.out.println("var1 / var2 = " + result);

        // Остаток от деление "%"
        int rest = var1 % var2;
        System.out.println("var1 % var2 = " + rest);
        System.out.println(" Целочислееное деление 4 / 2: " + 4 / 2); // 2
        System.out.println(" Остаток от деление 4 % 2: " + ( 4 % 2)); // 0

        System.out.println(" 5 / 10 = " + ( 5 / 10)); // 0
        System.out.println(" 5 % 10 = " + ( 5 % 10)); //5

        System.out.println("================\n");
        // Приоритет математических операций

        /*
        1. Сначало выполняется то, что в скобках.
        2. Затем  выполняется умножение, деление, остаток от деления
        3. В последнюю очередь выполняется сложение, вычитание
       */

        result = 2 + 10 / 2; // 7
        result = (2 + 10) / 2; // 6
        System.out.println(result);

        System.out.println("===============\n");

        double x = 20.0d; // d-явно указать,что чисмло записанно в формате double
        double y = 7.0; // все числа, записанные в нашем коде с "." считаются числами в формате  double

        //Деление"/"
        double resultDouble = x / y;
        System.out.println("resultDouble = " + resultDouble);

        int a = 20;
        int b = 7;
        int res = 20 / 7;
        System.out.println("Результат деления " + a + " на " + b + " равен = " + res);

        /*
        %d - целое число
        %s - текст
        %f - число с плавющей точкой
        %n - символ новой строки (используется в printf)
        \n - символ новой строки (универсальный) сплозуется как в println так и в других форматах.
         */

        // форматированный Вывод. Мы используем  шаблон вывода исписок значений,которые будут подставленны в этот шаблон.
        System.out.printf("Результат деления %d на %d равен = %d", a, b,res);
        System.out.println("Test");

        System.out.printf("Округленный вывод результата деления %f\n", resultDouble);
        System.out.printf("Округленный вывод результата деления %.4f\n", resultDouble);

        //Проблема с double
        double x1 = 0.1;
        double y1 = 0.2;
        double z = x1 + y1; // 0.30000000000000004
        System.out.println("0.1 + 0.2 = " + z);

        x = 1.0;
        y = 3.0;
        z = x1 / y1; //0.25
        System.out.println("z:" + z);
        // Тип double в комерческих фирмах при работе с деньгами не используется
    }
}
