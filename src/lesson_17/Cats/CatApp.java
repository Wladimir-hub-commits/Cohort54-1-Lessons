package lesson_17.Cats;

/**
 * Author Waldemar Ilz
 *{code data} 07.11.2024
 */

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Catty", 8, 5);

        System.out.println(cat.toString());

        //  System.out.println(cat.name); // name не доступно, так как помечено как private

        // cat.age = -1000; // Не доступно, так как помечено private

        // cat.weight = 1500;
        // доступен, т.к. age имеет модификатор по умолчанию (package-default)
        // cat.age = 100;

        //cat.name = null;

        System.out.println(cat.toString());

        //  cat.test(); приватный метод я не могу вызвать вне кода класса

        cat.sayMeow();
        // protected метод доступен, так как мы в одном пакете
        cat.testProtected();

        String catName = cat.getName();
        System.out.println("catName: " + catName);

        System.out.println("cat.getAge(): " + cat.getAge());

        cat.setName(null);
        System.out.println("==========");
        cat.setName("Max");

        cat.setAge(-1000);
        cat.setAge(15);


        System.out.println(cat.toString());

        cat.eat();

        System.out.println(cat.toString());


    }

}
