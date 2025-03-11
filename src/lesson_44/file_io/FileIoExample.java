package lesson_44.file_io;

import java.io.*;
import java.util.Arrays;

/**
 * Author Waldemar Ilz
 * {code data} 06.03.2025
 */

public class FileIoExample {
    public static void main(String[] args) throws InterruptedException {

        //

        File pathDir = new File("files");

        // boolean mkdir() - создает директорию,
        System.out.println(pathDir.mkdir());

        File pathDir2 = new File("file/db/v1");
        System.out.println(pathDir.mkdir());

        // boolean mkdirs() - создает все директории, включая все необходимые директории
        pathDir = new File("src/lesson_44/file_io/files/example");
        System.out.println(pathDir.mkdirs());

        // File(File/String parent, String child) - создает
        File lessonDir = new File("src/lesson_44/file_io/");
        File pathDb = new File(lessonDir, "db/v01");
        System.out.println("pathDb,mkdir(): " + pathDb.mkdir());

        // boolean delete() - удаляет директорию ()
        System.out.println(pathDir.delete());// удаление директории

        System.out.println("Удаление deleteOnExit()");
        // deleteOnExit() - удаляет директорию при завершении работы программы (JVN)
        pathDb.deleteOnExit();

        //
        Thread.sleep(1000);

        System.out.println("Программа завершила работу !");

        System.out.println("\n ==================\n");

        // boolean createNewFile() -
        File file = new File(lessonDir, "txt.txt");
        try {
            System.out.println(file.createNewFile());//
        } catch (IOException e) {
            e.printStackTrace();
        }

        // exists() - проверяет существует ли директория
        System.out.println("file.exists(): " + file.exists() + "lessonDir.exists(): " + lessonDir.exists());

        // isFile, isDirectory - проверяет является ли файлом или директорией
        System.out.println("file.isFile(): " + file.isFile());
        System.out.println("file.isDirectory(): " + file.isDirectory());

        System.out.println("file.length(): " + file.length());// размер файла
        System.out.println(file.lastModified());// время последнего изменения

        System.out.println("file.getName(): " + file.getName());// имя файла
        System.out.println("file.getPath(): " + file.getPath());// путь к файлу

        // String[] list() - возвращает список файлов в директории
        String[] names = lessonDir.list();
        System.out.println("names:" + Arrays.toString(names));

        // File[] listFiles() - возвращает список файлов в директории
        File[] files = lessonDir.listFiles();
        for (File currenFile : files) {
            System.out.println(currenFile.getName() + "|" + currenFile.getPath() + " |length: " + currenFile.length() + "isFile: "
                    + currenFile.isFile());



        }

        System.out.println("\n ==================\n");

        try {
            FileWriter fileWriter = new FileWriter(file,false);//
            fileWriter.write("Hello world!!!");
//            fileWriter.write("\n!");
//            fileWriter.write("String 2");

            fileWriter.close();// закрытие
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("\n ==================\n");

        // Чтение из файла с помощью BufferedReader
        // try с ресурсами - автоматическое закрытие ресурсов

        try (FileReader fileReader = new FileReader(file);//
        BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            // код, который вызывает исключение
            String line;
            line = bufferedReader.readLine();
            System.out.println("чтение строки завершено: " + line);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
