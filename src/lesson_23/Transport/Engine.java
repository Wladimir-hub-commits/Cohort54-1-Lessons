package lesson_23.Transport;

public class Engine {
    private int power;
    private final String type;

    private boolean isStarted;

    public Engine(String type, int power) {
        this.type = type;
        this.power = power;
    }
    public void start(){
        // Проверить запущен ли двигатель
        // Если нет - тогда запустить

        if (isStarted){
            System.out.println("Двигатель уже работает");

        }else{
            isStarted = true;
            System.out.println("Запустить двигатель");


        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", isStarted=" + isStarted +
                '}';
    }
}
