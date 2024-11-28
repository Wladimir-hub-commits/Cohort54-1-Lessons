package hwk_21.Task_02;

/**
 * Author Waldemar Ilz
 * {code data} 26.11.2024
 */

/*
3. Создайте класс Computer который будет содержать компоненты:
 процессор, память и накопитель.
 // Композиция - часть не может существовать
 без целого. Часть создаётся вместе с целым.
 */

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Storage storage, String procBrand, String procModel) {
        this.storage = storage;
        this.processor = new Processor(procBrand, procModel);
        this.memory = new Memory(" Crutial ", "DDR - 5400");
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public static void displayConfiguration() {
    }
}






