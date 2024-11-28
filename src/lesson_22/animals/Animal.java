package lesson_22.animals;

/**
 * Author Waldemar Ilz
 * {code data} 26.11.2024
 */


public class Animal  {
    public void voice(){ // класс - voice(подать голос)
        System.out.println("Animal say something");//реализация
    }
    // Полиморфизм. Переопределение метода родительского класса - Object
    public String ToString(){ // Класс который возвращает строку
        return  "Animal  to String"; // возвращает строку

    }
}
