package hwk_23.GameCharacter;

public abstract class GameCharacter {
    // Абстрактный метод attack
    public abstract void attack();
}
/*
Описание кода:
Абстрактный класс GameCharacter: Определяет абстрактный метод attack(), который будет переопределен в подклассах.

Классы-подклассы:

Warrior: Переопределяет метод attack(), чтобы вывести сообщение о том, что воин атакует мечом.
Mage: Переопределяет метод attack(), чтобы вывести сообщение о том, что маг использует заклинание.
Archer: Переопределяет метод attack(), чтобы вывести сообщение о том, что лучник стреляет из лука.
Класс Game: В main методе создается массив различных игровых персонажей, и для каждого из них вызывается метод attack(), что демонстрирует полиморфизм.

Запустив этот код, вы получите следующий вывод:
 */