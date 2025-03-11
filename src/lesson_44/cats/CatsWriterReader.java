package lesson_44.cats;

/**
 * Author Waldemar Ilz
 * {code data} 06.03.2025
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
class CatsWriterReader {

    public static void main(String[] args) {

        // Создаем список кошек
        List <Cat> cats = new ArrayList<>(List.of(
           new Cat ("Cat", 9, true),
           new Cat ("Jon", 2, true),
           new Cat ("Cat", 7, false),
           new Cat ("Cat", 4, true),
           new Cat ("Cat", 2, false),
           new Cat ("Cat", 6, false),
           new Cat ("Sebastian Junior", 1, true)

        ));

        // Создаем директорию
        File path = new File("src/lesson_44/cats/files");
        path.mkdirs();  // создаем директорию

        File file = new File(path, "cats.txt");

        // Метод, который запишет список кошек в текстовый файл

        writeCatsToFile(cats, file);

        // Считать из файла кошек и вывести в консоль

        List<Cat> newCats = readCatsFromFile(file);

        newCats.forEach(System.out::println);
        

    }
    // Метод, который считывает кошек из текстового файла
    private static List<Cat> readCatsFromFile(File file) {

        List<Cat> cats = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;

            // Будем считывать в цикле строки из файла, пока они есть.
            // На каждой итерации будем записывать каждую строку в переменную line
            // С читывать мы будем пока readLine() не вернет null
            while ((line = bufferedReader.readLine()) != null) { //Здесь присвоение переменной line  Пока readLine() не вернет null
                // name|9|true
                Cat cat = parseCatFromLine(line);// Парсим строку в Cat объект по особому формату
                cats.add(cat); // Запомнить этот метод
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cats;

    }
    // Метод, который парсит строку в Cat
    private static Cat parseCatFromLine(String line) {
     //   name|9|true
        System.out.println("line: "+ line);
        String[] parts = line.split("\\|");// метод сплит принимает регулярное выражение
        // и по этому мне надо его экранировать с помощью обратного слэша
//        System.out.println("arrayElements: "+ Arrays.toString(parts));

        return new Cat(parts[0], Integer.parseInt(parts[1]), Boolean.parseBoolean(parts[2]));

    }


    // Метод, который запишет список кошек в текстовый файл
    private static void writeCatsToFile(List<Cat> cats, File file) {

        // Удаляем файл если он есть
        if (file.exists()) file.delete();


        // Создать файл если его ещё нет.
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Перебираем список кошек и будем каждого записывать отдельной строкой особого формата
        for (Cat cat : cats) {
            //Открываем поток для записи. Ставим флаг разрешающий до-запись в файл true
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {//режим д-озаписи

                // name|age|isMale
                // В таком виде я хочу записать каждого кота в файл
                // формируем строку и записываем в файл
                String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                // Теперь записываем строку в файл
                bufferedWriter.write(toWrite);// Записываем в файл
                bufferedWriter.newLine();// Добавляет перевод каретки

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        // Закрываем поток
        System.out.println("Список кошек записан в файл");

    }

}


