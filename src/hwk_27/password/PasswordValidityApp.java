package hwk_27.password;

import static hwk_27.password.PasswordValidity.isValidPassword;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public class PasswordValidityApp {
    public static void main(String[] args) {
        String password = "PasswordValidity";

        if (isValidPassword(password)){
            System.out.println("Пароль соответствует всем требованиям");
        }else {
            System.out.println("Пароль не соответствует требованиям");
        }

    }

}
