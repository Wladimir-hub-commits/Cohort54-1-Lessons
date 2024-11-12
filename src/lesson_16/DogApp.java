package lesson_16;

/**
 * Author Waldemar Ilz
 *{code data} 05.11.2024
 */
public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bim", 5);

        dog.info();

        // Ctrl + D | Cmd + D
        dog.run();
        dog.run();
        dog.run();
        dog.run();

        dog.info();
    }
}
