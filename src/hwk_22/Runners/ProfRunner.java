package hwk_22.Runners;


/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */

public class ProfRunner extends AmateurRunner {

    {

    this.setTypeRunner("Профессионал");
    }

    public ProfRunner(int RunSpeed,int restTime){
        super(RunSpeed,restTime);

    }
    public ProfRunner(){
        super(25,5);
    }



}
