package lesson_20.transport;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */


//          Smartphone is-a Vehicle - НЕ верно. Наследоваться нельзя.
//            Bus is-a Vehicle -> Верно. Можно применять наследование
public class Bus extends Vehicle {

    /*
    A extends B -> A наследуется от класса B (класс A расширяет класс B)
    A - потомком (ребенком, наследником), B - родитель (родительский класс)
     */

    private int capacity; // вместимость
    private int countPassengers; // сколько сейчас пассажиров в автобусе

    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя
        // Вызов конструктора родительского класса
        super(model, year); // ключевое слово super - обращение к родителю.
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    // Взять на борт 1 пассажира
    public boolean takePassengers() {
        // Проверка. Есть ли свободное место?
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + model);
            return true;
        }
        // по сути пишу блок else
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров\n",
                this.getModel(), countPassengers);
        return false;
    }

    // Высадка пассажира из автобуса
    public boolean dropPassengers() {
        // Проверить есть ли в автобусе пассажиры
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса: " + model);
            return true;
        }

        System.out.printf("В автобусе %s больше нет пассажиров\n", model);
        return false;

    }

}

