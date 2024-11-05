package hwk_15;

/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

public class Doctor {

    String name;
    int age;
    String title;

    public Doctor(String doctorName ){
        name = doctorName;
    }
    public Doctor(){
    }
    public Doctor(String name, String title, int age) {
        this.name = name;
        this.title = title;
        this.age = age;
    }
    public void observe() {
        System.out.println("Я Наблюдаю");
    }

    public void makeADiagnosis(){
        System.out.println("Я Делаю Диагноз");
    }

    public void treat(){
        System.out.println("Я Лечу");
    }

    public void info(){
        System.out.printf("Я Доктор %s,Мой возраст: %d, Mой Титул: %s\n", name,age,title);
    }


}
