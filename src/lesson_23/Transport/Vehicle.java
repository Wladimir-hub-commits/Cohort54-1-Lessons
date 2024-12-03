package lesson_23.Transport;


/*

 */
public abstract class Vehicle {
        private Engine engine;

    //
    //
    //
    public abstract void startEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
