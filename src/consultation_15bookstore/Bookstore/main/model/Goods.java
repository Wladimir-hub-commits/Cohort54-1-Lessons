package consultation_15bookstore.Bookstore.main.model;

/**
 * Author Waldemar Ilz
 * {code data} 12.01.2025
 */

public class Goods {
    public static int counter = 1;
         int id;
         String name;
         CategoryGoods category;
         double price;

    public Goods(String name, CategoryGoods category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

}
