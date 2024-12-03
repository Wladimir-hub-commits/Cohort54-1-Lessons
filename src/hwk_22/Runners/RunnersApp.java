package hwk_22.Runners;

/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */

/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()).
Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе.
Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут,
необходимых для отдыха спортсменам
 */


public class RunnersApp  {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurRunner amateur = new AmateurRunner();

        human.run();
        System.out.println("============");
        amateur.run();

        System.out.println("==============");
        ProfRunner prof = new ProfRunner();
        prof.run();

        ProfRunner prof2 = new ProfRunner();
        prof2.run();
    }
}
