package lesson_27.pesons;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);// поменяли Конструктор this.email = email;// на -> setEmail(email)
        //для проверки email, чтобы не повторять его функционал в конструкторе и сэтТоре
        setPassword(password);// Тже самое делаем с thi.password = password;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // Логика проверки на валидность
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    /*
    vasya@gmail.com - валидный E-Mail
    @asyagmail.com - такой E-Mail существовать не может
    vasya@gmail.com
    vasya@gmail.net.de
    vasy12112a@gmail.net.de
    vasya@gmail.net.de

    // Список требований к E-Mail

    1. Должна присутствовать @ и только одна (done)
    2. Точка после собаки
    3. После последней точки должно быть минимум 2 символа
    4. Алфавит, цифры, '_', '-', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ должен быть буквой
     */

    private boolean isEmailValid(String email) {
        // Проверка на присутствие @
        // 1. Должна присутствовать @ (место вхождения первого с (начала) ищущего значения с лево на право)
        int indexAt = email.indexOf('@');
        // Проверка единственной @ (место вхождения последнего ищущего значения с (конца) с право на лево
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        //
        // 2. Точка после собаки (перегруженный indexOf) поиск значения от точки
        if (email.indexOf('.', indexAt + 2) == -1) return false;

        // 3. После последней точки должно быть минимум 2 символа
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        // 4. Алфавит, цифры, '_', '-', '.', '@'
        /* Проверить если мой символ не является не буквой алфавита
        ни цифрой ни нижним подчёркиванием, точкой или @ тогда говорим,
        что такой символ нам не подходит, тогда мне нужно всё перебрать
         */

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) {// Символ НЕ подходит
                return false;
            }

            /*
            Выглядит не красиво
                   // Символ подходит
            } else{
                   // Символ не подходит
                   return false;
                   ставим перед скобкой знак неравенства !
            }
             */
        }

        // 5. До собаки(@) должен быть хотя бы 1 символ
        // Проверка до собаки(@)нет ли одного символа
        if (indexAt == 0) return false;

        // проверка буквы символа если он является нулевой буквой алфавита
        if (!Character.isAlphabetic(email.charAt(0))) return false;


        return true;
    }

    /*
    // TOODO - Домашнее задание создать логику проверки (password)

    Требования к паролю
    1. Длина >= 8
    2. Должна быть мин 1 маленькая буква
    3. Должна быть мин 1 большая буква
    4. Должна быть мин 1 цифра
    5. Должен быть мин 1 спец.символ "!%$@&*()[]"
     */

    /* Пример:
        Завести  4 переменный типа boolean
        boolean isDigit = true;
        boolean isLowerCase = false;
        Запускаю цикл
        И после цикла во всех 4-х должно быть true. - тогда вернуть true
        Иначе пароль проверку не прошел - вернуть false


        Character.isLowerCase('v');
        Character.isUpperCase('v');
        Character.isDigit('v');

        boolean isDigit;
        boolean isLowerCase;

     */

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
