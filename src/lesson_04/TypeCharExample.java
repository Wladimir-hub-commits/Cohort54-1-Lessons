package lesson_04;

/**
 * @author Waldemar Ilz @date 19.09.2024
 *
 */
public class TypeCharExample {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет ханить букву А латинског алфавита
        char a1 = 65; // Переменная будет ханить букву А латинског алфавита, соответствующюю коду 65 в десятеричной системе счасления
        char a2 = 0x41; // Присваеваемкод  в 16 - ном формате. Что будет соответствовать все той же букве А
        a2 = 0x0041; // полная форма записи числа в 16-ой  системе счисления
        char a3 ='\u0041'; //еще один способ задать в 16-ом формате
         char x = '\u15d7';

        // _ 0..9 A..F -> A1C3 счисление в 16 - м формате

        // 189 -> 100 * 1 + 10 * 8 + 1 * 9;
        // 10 ^ 0; 10 ^ 1; 10 ^ 2

        // 00041 -> 16 ^ 0 * 1 + 16 ^ 1 * 4 + 16 ^ 2 * 0 + 16 ^ 3 * 0 -> 1 * 1 + 16 * 4 -> 64 + 1 = 65

        // 01000001 -> 2 ^ 6 + 2 ^ 0 = 65


        System.out.println("a:" + a);
        System.out.println("a1:" + a1);
        System.out.println("a2:" + a2);
        System.out.println("x:" + x);

        char digit0 = 48;
        System.out.println("digit:" + digit0);

        //digit0 = (char) (digit0 + 5);
        digit0 +=5;// digit0 = (char) (digit0 + 5);

         /*
         1.digit0 (char) -> int
         2. сложение двух int -> int
         3. Нужно явно пркоброзовать int а char
          */

        System.out.println("digit0:" + digit0);


        char letter = 97;
        System.out.println("letter:" + letter);
        letter++;
        System.out.println("letter:" + letter);

        System.out.println("преоброзование char -> int даст 10 - й код символа:" + (int) letter);
        System.out.println("0 + letter "); // так можно но, не нужно

         /*
        0....9 -> соответствуют коды 48...57
        a....z -> соответствуют коды 97...98
        A....Z -> соответствуют коды 65...90

          */
    }

}
