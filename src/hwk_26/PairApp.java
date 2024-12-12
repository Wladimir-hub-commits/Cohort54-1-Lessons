package hwk_26;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public class PairApp {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello" , "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println("\n====================\n");

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
