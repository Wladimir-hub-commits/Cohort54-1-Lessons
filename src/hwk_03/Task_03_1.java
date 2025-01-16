package hwk_03;

/**
 * @author Waldemar Ilz
 * {@code date} 19.09.2024
 */

/*
1.Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

2.Если клиент покупает товары вместе, то на них действует скидка 10%
на всю покупку.

3.Выведите на экран значение переменной, которая соответствует стоимости
товаров A+B со скидкой.
4.Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
 */

public class Task_03_1 {

    public static void main(String[] args) {
        double priceA = 1000;
        double priceB =500;


        double discount = 10; // в процентах

        double discountMoney = ( priceA + priceB) * discount / 100;

        double priceWithDiscount = priceA + priceB - discountMoney;

        double priceWithDiscount2 = (priceA + priceB ) * (100 - discount) / 100;


        System.out.println("discountMoney:" + discountMoney);
        System.out.println("priceWithDiscount:" + priceWithDiscount);
        System.out.println("priceWithDiscount2:"  + priceWithDiscount2);


    }
}
