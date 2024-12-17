package hwk_27.password;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

/*
     Домашнее задание: Создать логику проверки (password)
    что бы все перечисленные Требования к паролю одновременно
    выполнялись.

    Требования к паролю:
    1. Длина >= 8
    2. Должна быть мин 1 маленькая буква
    3. Должна быть мин 1 большая буква
    4. Должна быть мин 1 цифра
    5. Должен быть мин 1 спецсимвол "!%$@&*()[]"
     */

    /* Пример:
        Завести  4 переменный типа boolean
        boolean isDigit = true;
        boolean isLowerCase = false;
        Запускаю цикл
        И после цикла во всех 4-х должно быть true. - тогда вернуть true
        Иначе пароль проверку не прошел - вернуть false

     */

public class PasswordValidity {

    boolean isDigit;
    boolean isUpperCase;
    boolean isLowerCase;
    boolean isSpecialChar;

    public PasswordValidity(boolean isDigit, boolean isUpperCase,
                            boolean isLowerCase, boolean isSpecialChar) {
        this.isDigit = isDigit;
        this.isUpperCase = isUpperCase;
        this.isLowerCase = isLowerCase;
        this.isSpecialChar = isSpecialChar;
    }

    public static boolean isValidPassword(String password) {

        // Examination password.length() - Проверка длинны пароля
        if (password.length() < 8) {
            return false;
        }
        boolean hasDigit = false; // это Цифра
        boolean hasUpperCase = false; // это Верхй Регистр (Заглавные буквы А)
        boolean hasLowerCase = false; // это Нижний Регистр (прописные буквы а)
        boolean hasSpecialChar = false; // это Специальный Символ ("!%$@&*()[]").

        // SpecialChars - Специальные Символы
        String SpecialChars = "!%$@&*()[}";

        for (char v : password.toCharArray())//Это конструкция для "уловления" каждого символа строки password{

            if (Character.isLowerCase(v)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(v)) {
                hasUpperCase = true;
            } else if (Character.isDigit(v)) {
                hasDigit = true;
            } else if (SpecialChars.indexOf(v) != -1) {
                hasSpecialChar = true;
            }
        return hasSpecialChar && hasDigit && hasLowerCase && hasUpperCase;
    }


}


