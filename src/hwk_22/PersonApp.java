package hwk_22;

/**
 * Author Waldemar Ilz
 * {code data} 28.11.2024
 */

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Игорь");
        person.run();

        AmateurAthlete amateur = new AmateurAthlete("Владимир");
        amateur.run();

        ProfessionalAthlete profi = new ProfessionalAthlete("Сергей");
        profi.run();
    }
}

