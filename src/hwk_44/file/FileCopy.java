package hwk_44.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.io.*;

/**
 * Author Waldemar Ilz
 * {code data} 09.03.2025
 */
/*
Task 1
  Дан файл text.txt:

 Lorem ipsum dolor sit amet, consectetur adipisicing.
 Lorem ipsum dolor sit amet.
 Lorem ipsum dolor sit amet, consectetur adipisicing elit.
 Lorem, ipsum dolor.
 Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.
 Lorem, ipsum.
 Lorem ipsum dolor sit amet consectetur adipisicing elit.
 Lorem ipsum dolor sit.
 Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!

 Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt'
 и скопировать в него все данные из файла 'text.txt'
 */
public class FileCopy {
    public static void main(String[] args) {

        File path = new File("src/hwk_44/files/text.txt");
        path.mkdirs();


        String sourceFile = "text.txt";// исходный файл
            String destinationFile = "copy.txt"; // новый файл

            try (
                    BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))
            ) {
                String line;
                while ((line = reader.readLine()) != null) {// Пока readLine() не вернет null
                    writer.write(line);
                    writer.newLine(); // добавляем символ новой строки
                }
                System.out.println("Копирование завершено.");
            } catch (IOException e) {
                System.err.println("Ошибка при копировании файла: " + e.getMessage());
            }


    }
}