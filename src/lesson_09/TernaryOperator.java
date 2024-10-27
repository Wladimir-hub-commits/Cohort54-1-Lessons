package lesson_09;
/**
 * Author Waldemar Ilz
 *{code data} 10.10.2024
 */
public class TernaryOperator {
    public static void main(String[] args) {
         int x =  - 50; // какое - то число, которое мы получили от пользователя
         String result;
         if (x > 0){
             result = "больше нуля";
         }else{
             result = ("Меньше или равно нуля");
         }
         System.out.println(result);

         //Тернарный оператор
       String result2 = ( x > 0 ) ? "больше нуля" : "Меньше нуля  или равно нуля";
    }
}
