package lesson_04;

public class incrementExample {
    public static void main(String[] args) {

        int var = 5;

        var = var + 10;
        System.out.println("var:" + var);

        var += 2; // var = var +2;
        System.out.println("var:" + var);

        var -= 2; // var = var - 2;
        System.out.println("var - :" + var);

        var *= 2; // var = var * 2;

        var /= 2; // var = var / 2;

        System.out.println("var:" + var);

        // инкремент,
        var++; //var = var + 1; var += 1; // увеличить текущее значение переменной на 1
        System.out.println("var");

        // Декремент
        var--; //var = var - 1; var -= 1; // уменьшить текущее значение переменной на 1


        //посинкремент
        System.out.println("====================");
        int x = 100;
        System.out.println("x:" + x++);
        System.out.println("x:" + x);

        //прединкремент
        int y =100;
        System.out.println("y:" +  ++y);
        System.out.println("y:" +  +y);





    }
}
