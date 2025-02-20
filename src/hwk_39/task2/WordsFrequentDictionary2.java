package hwk_39.task2;

/**
 * Author Waldemar Ilz
 * {code data} 20.02.2025
 */


/*
Task2 (*Опционально):
Напишите метод, возвращающий частотный словарь вхождения символов в строку

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
Copy
//Output:
Строка: 2
для: 3
проверки: 3
количества: 2
вхождений: 1
слов: 2
и: 2
теста: 1

Вхождение символов:
'
': 1; ' ': 15; '.': 2; 'С': 2; 'а': 5; 'в': 8; 'д': 4; 'е': 7; 'ж': 1; 'и': 8;
 'й': 1; 'к': 7; 'л': 7; 'н': 1; 'о': 10; 'п': 3; 'р': 8; 'с': 5;
 */

public class WordsFrequentDictionary2 {


}
