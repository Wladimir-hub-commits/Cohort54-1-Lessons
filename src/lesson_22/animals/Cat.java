package lesson_22.animals;

/**
 * Author Waldemar Ilz
 * {code data} 26.11.2024
 */


public class Cat extends Animal{// Кошка (Cat)Расширяет животное (Animal)

    // Переопределить родительский метод voice
    // (изменить реализацию родительского метода)
    @Override //указывает, что я переопределяю родительский метод
    public void voice(){
        System.out.println("Cat sey MEOW!!!");
    }

    //Уникальный функционал кота
    public void eat(){
        System.out.println("Cat is eating");

    }

    //Перегрузка метода - статический полиморфизм
    public void eat(String food){
        System.out.println("Cat is eating " + food);
    }


}
