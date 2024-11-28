package hwk_21.Task_02;

/**
 * Author Waldemar Ilz
 * {code data} 26.11.2024
 */

/*
4. Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory
 не могу существовать без компьютера.
 */

public class ComponentApp {
    public static void main(String[] args) {
        Processor processor = new Processor("IntelCore","i7 - 13466984");
        Memory memory = new Memory("Corsair", "Vengeance LPX 16GB");
        Storage storage = new Storage("Asus", "X515Jab");

       // Computer computer = new Computer(processor,memory,storage);

       // computer.displayConfiguration();

    }
}
