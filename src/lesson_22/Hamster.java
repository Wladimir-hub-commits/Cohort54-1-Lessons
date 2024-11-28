package lesson_22;

/**
 * Author Waldemar Ilz
 * {code data} 26.11.2024
 */


import lesson_22.animals.Animal;

public class Hamster extends Animal {

    @Override
    public void voice() {
        System.out.println("Hamster voice Hrum-hrum");

    }

    @Override
    public String ToString() {
        return super.ToString() +" | Hamster, Дополнение родительского метода";
    }
}
