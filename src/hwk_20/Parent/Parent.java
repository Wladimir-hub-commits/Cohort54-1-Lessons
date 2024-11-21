package hwk_20.Parent;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */

public class Parent {

    protected String name;
    protected int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
