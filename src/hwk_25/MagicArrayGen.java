package hwk_25;

/**
 * Author Waldemar Ilz
 * {code data} 05.12.2024
 */

public class MagicArrayGen <T> {
    private T[] array;
    private int cursor; // присвоено значение по умолчание - 0;

    public MagicArrayGen() {
        array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public MagicArrayGen(T[] ints) {

        if (ints != null) {
            this.array = (T[]) new Object[ints.length * 2];
            addAll(ints);
        } else {
            this.array = (T[]) new Object[10];
        }

    }

    // Добавление в массив одного элемента
    public void add(T value) {

        // Проверка. Есть ли свободное места во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            // Курсор указывает на последнюю свободную ячейку
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    @SuppressWarnings("unchecked")
    // Динамическое расширение массива
    private void expandArray() {
        System.out.println("Расширяем массив! cursor: " + cursor);
        /*
        1. Создать массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // 1.
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого массива
        }

        // 3. Перебрасываем ссылку. Переменная array хранила ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }


    public void addAll(T... values) {
        // с values я могу обращаться точно также, как со ссылкой на массив int
//        System.out.println("Мы приняли несколько int-ов. А именно: " + values.length);
//        System.out.println("У каждого значения есть индекс. По индексом 0: " + values[0]);

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    // Удаление элемента по индексу
    public T remove(int index) {
        /*
        1. Проверить валидность индекса (что он не отрицательный и меньше курсора
        2. Запомнить, какое значение находилось под этим индексом
        3. Удалить значение из ячейки
        4. Передвинуть все элементы за индексом на 1 ячейку влево
        5. Передвинуть курсор влево
        6. Вернуть старое значение
         */

        if (index < 0 || index >= cursor) {
            // Индекс не валидный. Ничего в массиве не трогаем
            return null;
        }

        // 2. Запомнить значение
        T value = array[index];
        // 3, 4
        // индекс 11, курсор = 12
        //for (int i = 11; i <  12 - 1; i++) {
        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        // 5.
        cursor--;

        return value;
    }


    // Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            // Валидный индекс
            return array[index];
        }

        // Обработка не корректного индекса
        return null;

    }

    // [10, 100, 44, 100, 453, 100, 34]
    // Поиск первого вхождения элемента по значению
    // Возвращает индекс элемента. Если значение не найдено возвращает -1 (не существующий индекс для любого массива)
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                // нашли
                return i;
            }
        }
        // Перебрали все элементы. Не нашли ни одного совпадения.
        return -1;
    }

    // Поиск последнего вхождения элемента по значению
    public int lastIndexOf(T value) {


        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    //  возвращает все значения в виде обычного массива
    public T[] toArray() {
        T[] result = (T[])new Object[cursor];

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        return result;
    }

    // Удаление элемента по значению
    public boolean removeByValue(T value) {
        /*
        1. Есть ли у нас такой элемент в массиве?
        2. Если нет - то вернуть false
        3. Если есть - удалить этот элемент
        4. Вернуть true после удаление.
         */

        // 1.
        int index = indexOf(value);

        // 2.Значение не найдено. Удалять нечего.
        if (index == -1) return false;

        // Переиспользую существующий метод удаления элемента по индексу
        remove(index);
        return true;
    }

    // Замена значения по индексу - возвращает старое значение
    public T set(int index, T newValue) {
        /*
        1. Валидация индекса 0...cursor
        2. Вытащить старое значение - запомнить
        3. Записать новое значение
        4. Вернуть старое
         */
        // 1
        if (index < 0 || index >= cursor) {
            // Индекс не валидный
            return null;

        }

        T oldValue = array[index];
        array[index] = newValue;
        return oldValue;
    }


    // Возвращает строковое представление массива
    // [100, 200, 500]
    public String toString() {
        /*
        Открыть скобочку.
        Перебрать элементы.
        Добавить каждый элемент, добавить запятую (если элемент не последний)
        Закрыть скобочку
         */

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

}


/*
1. Добавлять в массив элементы (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы там есть) ++
4. Добавляем в массив сразу несколько значений ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу get(int index) ++
7. Удалять элемент по индексу (Если индекс есть - удалит элемент - вернет удаленное значение) ++
8. Поиск элемента по значению indexOf(int value) (определить есть ли в массиве элемент с таким значением) ++
9. Удалять элемент по значению boolean removeByValue(int value)
(Если значение есть - удалит элемент - вернет true, если такое значение было) ++

___

10. Поиск последнего вхождения по значению lastIndexOf -- HW
11. Замена значения по индексу (есть индекс и новое значение) - возвращает старое значение ++
12. Конструктор, который принимает обычный массив и создает MagicArray с такими же значениями ++
13. Метод, который возвращает все значения в виде обычного массива - HW

 */

