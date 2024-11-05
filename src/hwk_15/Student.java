package hwk_15;

/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

/*
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания.
 */

public class Student {

    String name;
    int age;
    String title;

    public Student(String studentName ){
        name = studentName;
    }
    public Student(){
    }
    public Student(String name, String title, int age){
       this.name = name;
        this.title = title;
        this.age = age;
    }
    public void studying(){
        System.out.println("Я штудирую");
    }
    public void learn(){
        System.out.println("Я учу");
    }
    public void development(){
        System.out.println("Я развиваюсь");
    }
    public void info(){
        System.out.printf("Я студент %s,Мой возраст: %d, Mой Титул: %s\n", name,age,title);
    }

}
