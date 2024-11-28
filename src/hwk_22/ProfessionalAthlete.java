package hwk_22;

/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */

public class ProfessionalAthlete extends  Person{


    public ProfessionalAthlete(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " бежит со скоростью 25 км/ч.");
        rest();
    }

    @Override
    protected void rest() {
        System.out.println(name + " требуется отдых после пробежки: 5 минут.");
    }
}
