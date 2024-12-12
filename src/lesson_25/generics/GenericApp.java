package lesson_25.generics;

public class GenericApp {
    public static void main(String[] args) {
       // GenericBox<Car> boxCar = new GenericBox<>();
        GenericBox<String> box = new GenericBox<>("Hello");

        String strVal = box.getValue();
        System.out.println(strVal.length());
        System.out.println(box.getValue().toUpperCase());

        box.setValue("Test");
        System.out.println(box);

        System.out.println("\n================\n");

        // Generics работаю ТОЛЬКО со ссылочными типами данных
        // Т.е. НЕ работают с примитивами
        // GenericBox<int> boxInt = new GenericBox<>();

    }
}