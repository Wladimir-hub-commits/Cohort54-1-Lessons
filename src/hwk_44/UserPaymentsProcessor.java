package hwk_44;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Author Waldemar Ilz
 * {code data} 09.03.2025
 */

/*
Task 2
Дан файл с историей поступлений денег на счета пользователей за некий период времени:

 user1:2050
 user2:1200
 user1:1700
 user3:1800
 user1:1300
 user4:2100
 user2:750

Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
Output:

less.txt

user2:1950
user3:1800

more.txt:

user1:5050
user4:2100
 */

public class UserPaymentsProcessor {
    public static void main(String[] args) {
        String inputFilePath = "payments.txt"; // Путь  входному файлу
        String lessFilePath = "less.txt";       // Путь к выходному файлу для пользователей с суммой менее 2000
        String moreFilePath = "more.txt";       // Путь к выходному файлу для пользователей с суммой 2000 и больше

        Map<String, Integer> userPayments = new HashMap<>();

        // Чтение данных из файла
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String user = parts[0];
                    int amount = Integer.parseInt(parts[1]);
                    userPayments.put(user, userPayments.getOrDefault(user, 0) + amount);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Запись результатов в файлы
        try (BufferedWriter lessWriter = new BufferedWriter(new FileWriter(lessFilePath));
             BufferedWriter moreWriter = new BufferedWriter(new FileWriter(moreFilePath))) {

            for (Map.Entry<String, Integer> entry : userPayments.entrySet()) {
                String user = entry.getKey();
                int totalAmount = entry.getValue();

                if (totalAmount < 2000) {
                    lessWriter.write(user + ":" + totalAmount);
                    lessWriter.newLine();
                } else {
                    moreWriter.write(user + ":" + totalAmount);
                    moreWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



