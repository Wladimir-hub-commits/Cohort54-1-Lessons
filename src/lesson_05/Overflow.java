package lesson_05;

/**
 * @author Waldemar Ilz
 *   {@code date} 24.09.2024
 */
public class Overflow {
    public static void main(String[] args) {

        // Переполнение типа дпнных
        byte b1 = 127;
        b1++;

        System.out.println(b1);
        b1--;
        System.out.println(b1);

        short s1 = 32760;
        s1 +=7;
        System.out.println("s1" +s1);
        s1++;
        System.out.println(s1);



    }
}
