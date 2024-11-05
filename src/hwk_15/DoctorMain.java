package hwk_15;

public class DoctorMain {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.observe();
        doctor.makeADiagnosis();
        doctor.treat();
        System.out.println("\n==================\n");
        Doctor doctor1 = new Doctor("Dr. Schmidt", "M.D", 40 );
        System.out.println();
        doctor1.info();

    }

}
