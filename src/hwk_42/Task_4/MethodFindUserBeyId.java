package hwk_42.Task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Author Waldemar Ilz
 * {code data} 04.03.2025
 */
/*
Task 4 Опционально
Напишите метод findUserById(int id), который возвращает Optional<User>.
Метод принимает List<User> и int id.

Если пользователь с заданным id существует в списке, вернуть Optional с пользователем,
 иначе вернуть Optional.empty().

Подсказка:
Используйте Optional.of(user) или Optional.empty().
 */
public class MethodFindUserBeyId {

    public static void main(String[] args) {

        // List<User> users = new ArrayList<>();
        User user1 = new User(1, "John");// создаем пользователей
        User user2 = new User(2, "Alice");
        User user3 = new User(3, "Bob");
        User user4 = new User(4, "Tom");
        User user5 = new User(5, "Jane");

        // добавляем пользователей в список
        List<User> users = Arrays.asList(user1, user2, user3, user4, user5);// создаем список
        UserService userService = new UserService();// создаем экземпляр класса
        Optional<User> foundUser = userService.findUserById( users, 5); // вызываем метод
        foundUser.ifPresent(user -> System.out.println("Нашли пользователя: " + user));// выводим результат

    }

}
