package hwk_22.Runners;

/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */

public class Human {
    private final int runSpeed;
    private final int resTime;

    private String typeRunner = "Человек,";

    public Human(){
        this.runSpeed = 10;
        this.resTime = 15;

    }

    public Human(int runSpeed, int resTime) {
        this.runSpeed = runSpeed;
        this.resTime = resTime;
    }
    public void run() {
        System.out.println(typeRunner + " бежит со скоростью " + runSpeed + "km/ч");
        rest();
    }
    public void rest(){
        System.out.println(typeRunner + " нужно для отдыха " + resTime + "минут");

    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getResTime() {
        return resTime;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }

    @Override
    public String toString() {
        return "Human{" +
                "runSpeed=" + runSpeed +
                ", resTime=" + resTime +
                '}';
    }
}
