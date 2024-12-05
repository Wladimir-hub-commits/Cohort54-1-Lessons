package hwk_23.GameCharacter;

// Класс Warrior
public class Warrior extends  GameCharacter {
    @Override
    public void attack() {
        System.out.println("Воин атакует мечом!");
    }
/*
Объяснение кода:

Интерфейсы:
Swimmer содержит метод swim().
Runner содержит метод run().

Класс Triathlete:
Реализует оба интерфейса.

Переопределяет методы swim() и run(), чтобы предоставить
реализацию для каждого из них.

Класс TriathleteApp:
Создает объект Triathlete.

Вызывает методы swim(), run() чтобы продемонстрировать, как работает класс.
*/
}
