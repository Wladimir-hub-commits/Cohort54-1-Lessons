package lesson_24.flyers;


// Поддержка множественной реализации
// Класс может реализовывать любое количество интерфейсов,
// это позволяет нам частично обойти ограничения
// на множественное наследование
public class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");

    }
}
