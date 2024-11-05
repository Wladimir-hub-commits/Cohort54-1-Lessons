package hwk_15;

/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.works();
        teacher.learn();
        teacher.explains();
        System.out.println("\n==================\n");
        Teacher teacher1 = new Teacher("Сергей", "Профессор", 100 );
        System.out.println();
        teacher1.info();
    }

}
