package hwk_15;


/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

public class Teacher {

    String name;
    int age;
    String title;

    public Teacher(String teacherName ){
        name = teacherName;
    }

    public Teacher(){

    }
    public Teacher(String name, String title, int age){
        this.name = name;
        this.age = age;
        this.title = title;
    }

    public void works(){
        System.out.println("Учитель работает");
    }
    public void learn(){
        System.out.println("Учитель преподаёт ");
    }
    public void explains(){
        System.out.println("Учитель объясняет");
    }
    public void info(){
        System.out.printf("Я Учитель %s,Мой возраст: %d, Mой Титул: %s\n", name,age,title);
    }
}
