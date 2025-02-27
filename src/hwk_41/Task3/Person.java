package hwk_41.Task3;

/**
 * Author Waldemar Ilz
 * {code data} 27.02.2025
 */

/*
Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
 которые старше определенного возраста и проживают в определенном городе,
 а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */


public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "ListOfPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
