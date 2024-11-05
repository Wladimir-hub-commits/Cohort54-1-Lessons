package hwk_15;

/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.learn();
        student.studying();
        student.development();
        System.out.println("\n==================\n");
        Student student1 = new Student("Waldemar", "Студент", 40 );
        System.out.println();
        student1.info();

    }
}
