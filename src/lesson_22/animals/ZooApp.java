package lesson_22.animals;

import lesson_22.Dog;
import lesson_22.Hamster;

public class ZooApp {

      /*
    Два вида полиморфизма:
    1. Статический полиморфизм - полиморфизм времени компиляции
    Достигается он с помощью перегрузки методов (method overloading). (Когда он в рамках одного класса существует несколько методов
    с одинаковым именем, но разным набором параметров)


    2. Динамический полиморфизм - полиморфизм времени выполнения
    Достигается он с помощью переопределения методов (method overriding)
    Переопределение методов происходит когда подкласс (потомок) предоставляет
     специфическую реализацию метода, который уже определен в его супер-классе (родителе)
     */

    public static void main(String[] args) {

        /*
        class Object
        Класс, от которого наследуются все классы в Java
        Он является корнем иерархии классов.
        Любой класс неявно наследуется от класса Object, если не указано иное
        (Когда класс не расширяет явно другой класс)
         */

        Cat cat = new Cat();

        cat.eat();
        cat.voice();
        System.out.println(cat.toString());

        System.out.println("\n ======== DOG ============= \n");


        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("\n ======== Hamster ============= \n");

        Hamster hamster = new Hamster();
        hamster.voice();
        // Всегда, когда мы передаем в s.out ссылку на объект
        // автоматически вызывается метод toString для получения строкового представления
        System.out.println(hamster);


    }
}
