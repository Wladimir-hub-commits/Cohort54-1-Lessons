package lesson_24;

public class PrinterApp {
    public static void main(String[] args) {
        Printable book = new Book("Философия Java", "Б.Эккель");

        book.print();
        // По ссылке типа интерфейс, я не могу вызвать метод класса,
        // которого нет в интерфейсе
        //book.uniqueMethod();
        // Доступны методы Object
        System.out.println(book.toString());

        book.defaultMethod();
        Printable.staticMethod();

        System.out.println("\n==============\n");
        Printable journal = new Journal("Cosmopolitan", 154);
        journal.print();
        journal.defaultMethod();

        System.out.println("\n=======================\n");
        ColorPrintable colorPrintable = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP",
                20
        );

        colorPrintable.print();
        colorPrintable.colorPrint();
        colorPrintable.defaultMethod();



    }
}
