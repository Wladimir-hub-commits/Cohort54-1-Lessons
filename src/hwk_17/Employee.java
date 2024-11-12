package hwk_17;

/**
 * Author Waldemar Ilz
 *{code data} 12.11.2024
 */

/*
Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.

 */

public class Employee {
   private String name;
   private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    public void info(){
        System.out.println("Имя:" +name );
        System.out.println("Возраст:" + age);
        System.out.println("Зарплата:" + salary);
    }
}
