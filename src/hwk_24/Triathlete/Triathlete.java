package hwk_24.Triathlete;

/**
 * Author Waldemar Ilz
 * {code data} 04.12.2024
 */

// Класс, который реализует оба интерфейса
public class Triathlete implements Swimmer, Runner{
    @Override
    public void swim() {
        System.out.println("Triathlete is swimming");
    }

    @Override
    public void run() {
        System.out.println("Triathlete is running");
    }
}
