package hwk_21;

/**
 * Author Waldemar Ilz
 * {code data} 26.11.2024
 */

/*
3. Создайте класс Computer который будет содержать компоненты:
 процессор, память и накопитель.
 */

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory,Storage storage){
        this.processor = processor;
        this.memory = memory;
        this.storage  = storage;

    }
    public void displayConfiguration(){
        System.out.println("Computer Configuration:");
        System.out.println("Processor:" + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
    }

}
