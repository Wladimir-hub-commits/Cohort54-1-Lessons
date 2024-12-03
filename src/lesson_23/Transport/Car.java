package lesson_23.Transport;

public class Car extends Vehicle{
    public Car(Engine engine) {
        super();
        setEngine(engine);
    }

    @Override
    public void startEngine() {
        this.getEngine().start();
    }
}
