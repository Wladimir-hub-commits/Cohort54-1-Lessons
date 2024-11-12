package hwk_16;

import java.util.Arrays;

/**
 * Author Waldemar Ilz
 *{code data} 06.11.2024
 */

/*

Task 1
В MagicArray должны быть реализованы методы:

1. Добавление элемента - (Add an item)
2. Вывести все значения в массиве в консоль - (Print all values in the array to the console)
3. Поиск элемента по значению indexOf - (вернуть индекс, если такое значение есть в массиве)
Searching for an element by indexOf value - (return an index if such a value exists in the array)
4. Возвращение значения по индексу - (Returning a value by index)
5. Текущее количество элементов в массиве - ( Current number of elements in the array)
6. Удаление элемента по индексу remove - (Delete an item by the remove index)
7. Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
 Adding multiple elements (passes a sequence of values as arguments)
8. Конструктор, принимающий в себя обычный массив и создающий MagicArray с такими же значениями
 A constructor that takes a regular array and creates a MagicArray with the same values
9. Удаление элемента по значению -( Delete an item by value)

 */

public class MagicArray {

    private Object[] elements;
    private int size;

    // Конструктор, принимающий обычный массив
    public MagicArray(Object[] array) {
        this.elements = Arrays.copyOf(array, array.length);
        this.size = array.length;
    }

    public MagicArray() {
        this.elements = new Object[10]; // Начальный размер массива
        this.size = 0;
    }

    // 1. Добавление элемента
    public void add(Object element) {
        ensureCapacity();
        elements[size++] = element;
    }

    // 2. Вывести все значения в массиве в консоль
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    // 3. Поиск элемента по значению indexOf
    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1; // Если не найдено
    }

    // 4. Возвращение значения по индексу
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        return elements[index];
    }

    // 5. Текущее количество элементов в массиве
    public int currentSize() {
        return size;
    }

    // 6. Удаление элемента по индексу
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; // Освободить ссылку на удаленный элемент
    }

    // 7. Добавление нескольких элементов
    public void addAll(Object... elementsToAdd) {
        for (Object element : elementsToAdd) {
            add(element);
        }
    }

    // 9. Удаление элемента по значению
    public boolean removeByValue(Object value) {
        int index = indexOf(value);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false; // Если элемент не найден
    }
    // Увеличение ёмкости массива если необходимо
    private void ensureCapacity() {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }
}
