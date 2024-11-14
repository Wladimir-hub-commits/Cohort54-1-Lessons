package hwk_18;

/**
 * Author Waldemar Ilz
 *{code data} 13.11.2024
 */
/*
Task 2 * (Опционально)
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка

Должна уметь прыгать и должна уметь тренироваться.

За каждую тренировку высота прыжка увеличивается максимум
на 10 сантиметров

Максимальная высота прыжка, которую может натренировать собака,
 не может быть больше, чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier. В параметрах метод принимает
 высоту барьера. Если собака в состоянии преодолеть этот барьер
 - прыгает. Если не в состоянии, нужно проверить помогут ли тренировки
 (будет ли данная собака в принципе в состоянии взять барьер).
 Если да -> идем тренироваться -> берет барьер
 */
public class Dog {
    private String name;
    private int jumpHeight;
    private int initialJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.initialJumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
    public void jumpBarrier(int barrierHeight){

    }
}
