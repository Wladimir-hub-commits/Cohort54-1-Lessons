package lesson_21;

/**
 * Author Waldemar Ilz
 * {code data} 21.11.2024
 */

    /*

    Ассоциация - это связь, при которой один объект связан с другим объектом.
    Это наиболее общая форма связи.

    Агрегация - это более специфическая форма ассоциации, представляющая собой отношение "часть-целое"
    Где часть может существовать независимо от целого

    Композиция - это более жесткая форма агрегации, где часть не может существовать юез целого
     Если целое уничтожается, часть также уничтожается.

     Для создания связи типа HAS_A мы определяем полек класса,
     которое будет хранить ссылку на объект другого класса.

     Ассоциация (в том числе Агрегация и Композиция)
     реализуется через создание ссылок на другие объекты внутри класса.
     Отношение, где один класс использует другой класс в качестве одного из своих полей.
     Класс содержит поле, которое ссылается на объекты другого класса.

     ВАЖНЫЕ аспекты ассоциации

     Направленность связи: Однонаправленная и двунаправленная

     Кардинальность связи. Определяет, сколько объектов одного класса может быть
     ассоциировано с объектом другого класса

     One-to-One (один к одному), One-to-Many (один ко многим), Many-to-Many (многие ко многим)

     1 : 1
     Автобус и Двигатель.
     Каждый автобус будет иметь ровно один двигатель.
     И на каждый двигатель приходится ровно один автобус

     1 : Many
     Автобус и Список пассажиров
     Один автобус может перевозить множество пассажиров
     Каждый пассажир находится в одном автобусе

     Many : Many
     Список Автобусов и список автобусных остановок.
     Каждый автобус останавливается на множестве остановок
     И каждая остановка может обслужить множество автобусов

    */

public class Autobus {
    private static int counter;

    private final int id;

    //  поля, хранящие ссылки на объекты BusDriver и Autopilot
    private BusDriver driver; // агрегация (мягкая связь)
    private Autopilot autopilot; // композиция (жесткая / неразрывная связь)

    private final int capacity;
    private int countPassengers;

    // Список пассажиров. Агрегация. Однонаправленная. 1 : Many. В 1 автобусе множество пассажиров
    private final Passenger[] passengers;

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.driver = busDriver;
        this.capacity = capacity;
        // Часть (объект автопилота) создается при создании целого (объект автобуса)
        this.autopilot = new Autopilot("AP-v001");
        // Реализуем двунаправленность связи
        this.autopilot.setAutobus(this); // передаю ссылку на этот автобус
        this.passengers = new Passenger[capacity]; // null
    }

    public
    boolean takePassenger(Passenger passenger) {
        /*
        Надо проверить:
        1. Есть ли свободное место
        2. Находится ли этот пассажир уже в автобусе
        3. Если проверки пройдены - садим на борт
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем кол-во пассажиров в автобусе
            3.3. Возвращаем true
        4. Если что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */

        if (countPassengers < capacity) {
            // Место есть
            // Надо проверить, есть ли такой пассажир в автобусе
            // Декомпозиция
            if (isPassengerInBus(passenger)) {
                // такой пас есть в списке
                System.out.printf("Пассажир id: %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }

            // Садим на борт
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир id: %d завершил посадку в автобус с id %d\n", passenger.getId(), this.id);
            return true;
        }

        // Свободного места нет
        System.out.printf("В автобусе id: %d свободных мест нет!\n", this.id);
        return false;
    }

    // TODO написать метод высадки пассажира из автобуса
    /*
    Проверить есть ли пассажир в автобусе.
    Убрать его из списка пассажиров
    [ 1, 2, 6, 78, 99] -> убрать с id 6 [1, 2, 78, 99]
    Уменьшить кол-во пассажиров
     */

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        // пассажира с таким id нет в нашем массиве пассажиров
        return false;
    }

    // Объект автобуса будет управлять автопилотом
    public void updateAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    public void installNewAutopilot(String softwareVersion) {
        this.autopilot.setAutobus(null);
        // Следить за правильностью ссылок с обеих сторон двунаправленной связи
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }

    @Override
    public String toString() {
        return "Autobus: {" +
                "id=" + id + " , capacity=" + capacity +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                '}';
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}