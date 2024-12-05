package lesson_24;


// Интерфейс может расширять другой интерфейс
// Для расширения используется ключевое слово extends
// Дочерний интерфейс наследует все методы родительского интерфейса
public interface ColorPrintable extends Printable {

    void colorPrint();
    // Без этой строчки интерфейс получил бы реализацию по умолчанию от Printable
    // void defaultMethod();

}
