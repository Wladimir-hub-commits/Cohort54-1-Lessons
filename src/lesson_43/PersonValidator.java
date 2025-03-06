package lesson_43;

/**
 * Author Waldemar Ilz
 * {code data} 04.03.2025
 */

public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {
        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new EmailValidateException("@ error");

        // 2. Точка после собаки
        if (email.indexOf('.', indexAt + 2) == -1) throw new EmailValidateException(". after @ error");

        // 3. После последней точки должно быть минимум 2 символа
        if (email.lastIndexOf('.') >= email.length() - 2) throw new EmailValidateException("last . error");

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) { // Символ НЕ подходит
                throw new EmailValidateException("illegal symbol");
            }
        }

        // 5. До собаки должен быть хотя бы 1 символ
        if (indexAt == 0) throw new EmailValidateException("@ should not be first");

        if (!Character.isAlphabetic(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

    }

}
