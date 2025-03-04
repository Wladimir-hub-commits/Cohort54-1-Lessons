package hwk_42.Task_4;

import java.util.List;
import java.util.Optional;

/**
 * Author Waldemar Ilz
 * {code data} 04.03.2025
 */

public class UserService {
    public Optional<User> findUserById(List<User> users, int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
}
