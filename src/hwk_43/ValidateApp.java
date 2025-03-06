package hwk_43;

/**
 * Author Waldemar Ilz
 * {code data} 06.03.2025
 */

public class ValidateApp {
    public static void main(String[] args) {

        ValidatorPassword validator = new ValidatorPassword();
       String passwordToCheck = "password Test@123";

        try {
            validator.validatePassword(passwordToCheck);
            System.out.println("Пароль прошел проверку.");
        } catch (Exception e) {
            System.out.println("Пароль не прошел проверку: " + e.getMessage());
        }

    }


}
