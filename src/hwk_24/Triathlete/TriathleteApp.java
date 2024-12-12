package hwk_24.Triathlete;

/**
 * Author Waldemar Ilz
 * {code data} 04.12.2024
 */
/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run()
 соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия,
связанные с бегом и плаванием.
 */
// Главный класс для тестирования
public class TriathleteApp {
    public static void main(String[] args) {


        Triathlete triathlete = new Triathlete();
        triathlete.swim();
        triathlete.run();

        System.out.println("\n==============\n");

        Swimmer athlete = new Triathlete();
        athlete.swim();

        if (triathlete instanceof Swimmer){
            Swimmer swimmer = (Swimmer) triathlete;
            swimmer.swim();
        }

        if (triathlete instanceof Runner){
            Runner runner = (Runner) triathlete;
            runner.run();
        }



    }

/*
Объяснение кода:

Интерфейсы:
Swimmer содержит метод swim().
Runner содержит метод run().

Класс Triathlete:
Реализует оба интерфейса.

Переопределяет методы swim() и run(),
чтобы предоставить
реализацию для каждого из них.

Класс TriathleteApp:
Создает объект Triathlete.

Вызывает методы swim(), run() чтобы продемонстрировать, как работает класс.
*/
}
