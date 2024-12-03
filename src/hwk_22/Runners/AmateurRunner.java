package hwk_22.Runners;

/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */

public class AmateurRunner extends Human{
    public AmateurRunner(){
        super(15,10);
        this.setTypeRunner("Любитель");
    }

    public AmateurRunner(int runSpeed, int resTime) {
        super(runSpeed, resTime);
    }
}
