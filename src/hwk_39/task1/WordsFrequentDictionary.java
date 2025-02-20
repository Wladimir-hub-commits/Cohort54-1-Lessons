package hwk_39.task1;

import java.util.HashMap;
import java.util.Map;

/**
 * Author Waldemar Ilz
 * {code data} 20.02.2025
 */

/*
Task 1:
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает
 Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.
 */

public class WordsFrequentDictionary {

    public static void main(String[] args) {
        String text = "Hello, world! How are you? Hello, world! Hello, world!";
        Map<String, Integer> wordCountMap = wordsFrequentDictionary(text);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
    public static Map<String, Integer> wordsFrequentDictionary(String text) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                return wordCountMap;
            }

        }

        return wordCountMap;
    }


}