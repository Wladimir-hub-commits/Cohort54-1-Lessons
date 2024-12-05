package hwk_23.GameCharacter;

// Главный класс, где будет выполняться программа
public class Game {
    public static void main(String[] args) {
        // Создаем массив игровых персонажей
        GameCharacter[] characters = new GameCharacter[3];

        // Заполняем массив различными персонажами
        characters[0] = new Warrior();
        characters[1] = new Mage();
        characters[2] = new Archer();

        // Вызываем метод attack() для каждого персонажа в цикле
        for (GameCharacter character : characters) {
            character.attack();
        }
    }
}
