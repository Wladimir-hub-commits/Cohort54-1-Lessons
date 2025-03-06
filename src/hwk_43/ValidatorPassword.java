package hwk_43;

/**
 * Author Waldemar Ilz
 * {code data} 06.03.2025
 */

public class ValidatorPassword {

    public void validatePassword(String password) throws PasswordValidateException {
        if (password == null || password.length() < 8) {
            throw new PasswordValidateException("Пароль должен содержать не менее 8 символов.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы одну заглавную букву.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы одну строчную букву.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы одну цифру.");
        }
        if (!password.matches(".*[!@#$%^&*()_+\\-=$$$${};':\"\\\\|,.<>\\/?].*")) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы один специальный символ.");
        }

    }
}
