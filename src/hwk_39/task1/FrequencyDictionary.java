package hwk_39.task1;


import java.util.HashMap;
import java.util.Map;

/**
 * Author Waldemar Ilz
 * {code data} 20.02.2025
 */

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает
 Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.

Task2 (*Опционально):
Напишите метод, возвращающий частотный словарь вхождения символов в строку
 */
public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
        // Первая возможность переписать код
        System.out.println("Option 1:" + frequencyMap);

        // Вторая возможность переписать код
        System.out.println("Option 2:" + frequencyDictionary2(text));
        // Третья возможность переписать код
        // Синтаксический сахар:
        System.out.println("Option 3:" + frequencyDictionary3(text));
        frequencyMap = frequencyDictionary2(text);
        Map<String, Integer> frequencyMap2 = frequencyDictionary3(text);
        System.out.println("frequencyMap.equals(frequencyMap2): " + frequencyMap.equals(frequencyMap2));
        /*
        и в картах переопределён метод equals()
         */
        System.out.println("Option 4:" + frequencyDictionary4(text));
        System.out.println("Option 5:" + frequencyDictionary5(text));


//        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));

//        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);
//
//        System.out.println("\nВхождение символов: ");
//        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
//        System.out.println();
    }

    // "Option 1:"
    private static Map<String, Integer> frequencyDictionary(String text) {

        /*
    1. Поместить в какую - то коллекцию слова, которые встречаются в тексте.
    2. Создать карту вхождений слова в тексте -> ключ слово, значение количество вхождений
    3. Перебрать коллекцию слов и добавить в карту.
    Проверять:
             Существует ли слово в коллекции - обновить значение (старое значение + 1)
            Если слова нет - добавить новую пару: ключ со значением 1

     */
        // 1. Поместить в какую - то коллекцию слова, которые встречаются в тексте.
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
//        System.out.println(Arrays.toString(words));

        // 2. Создать карту вхождений слова в тексте -> ключ слово, значение количество вхождений
        Map<String, Integer> result = new HashMap<>();

        // 3. Перебрать коллекцию слов и добавить в карту.
        for (String word : words) {

            // Пытаюсь получить значение, ассоциированное ключу "текущее слово"
            Integer amount = result.get(word);

            // Если такого ключа нет - вернётся null
            if (amount == null) amount = 0;

            // увеличиваю значение amount на 1
            amount += 1;

            // Записываю в карту новую или обновлённую пару ключ - значение
            result.put(word, amount);
        }
        return result;

    }

    // "Option 2:"
    // Вторая возможность переписать код
    private static Map<String, Integer> frequencyDictionary2(String text) {


        // 1. Поместить в какую - то коллекцию слова, которые встречаются в тексте.
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
//        System.out.println(Arrays.toString(words));

        // 2. Создать карту вхождений слова в тексте -> ключ слово, значение количество вхождений
        Map<String, Integer> result = new HashMap<>();

        // 3. Перебрать коллекцию слов и добавить в карту.
        for (String word : words) {
            // Пытаюсь получить значение, ассоциированное ключу "текущее слово"
            // Если такого ключа нет - вернётся null
            // увеличиваю значение amount на 1

            // Сокращение В одну строчку
            Integer amount = result.getOrDefault(word, 0);

            // Записываю в карту новую или обновлённую пару ключ - значение
            result.put(word, ++amount);
        }
        return result;

    }

    // "Option 3:"
    // Два новых метода, которые есть в interface Map, которые являются синтаксическим сахаром
    /*
    Что такое синтаксический сахар?
    Метод не обладает ничего, кроме того, что дополнительно упрощает код.
     */
    // Синтаксический сахар:
    private static Map<String, Integer> frequencyDictionary3(String text) {
        // 1. Поместить в какую - то коллекцию слова, которые встречаются в тексте.
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
        // 2. Создать карту вхождений слова в тексте -> ключ слово, значение количество вхождений
        Map<String, Integer> result = new HashMap<>();
        // 3. Перебрать коллекцию слов и добавить в карту.
        for (String word : words) {
            // Синтаксический сахар:
            /*
            compute(K key, BiFunction<K,V,V> remappingFunction)
            Метод compute - позволяет вычислить новое значение для указанного ключа,
            используя новую функцию пересчёта.
            Новое значение может зависеть от текущего ключа и текущего значения.
            Если функция пересчёта возвращает null, то ключ удаляется из карты.
             */
            // oldValue == result.get(word)
            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
            // Лямбда выражение - это анонимная функция (это реализация какого то метода в интерфейсе)

            //     result.put(word1);
            //     result.put(word,oldValue +1);

            //  У этого метода есть две разновидности:
        }
        return result;
    }

    // "Option 4:"
    //  У этого метода (compute) есть два разделения:
    private static Map<String, Integer> frequencyDictionary4(String text) {
        // 1. Поместить в какую - то коллекцию слова, которые встречаются в тексте.
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
        // 2. Создать карту вхождений слова в тексте -> ключ слово, значение количество вхождений
        Map<String, Integer> result = new HashMap<>();
        // 3. Перебрать коллекцию слов и добавить в карту.
        for (String word : words) {
            // Синтаксический сахар:
            /*
            compute(K key, BiFunction<K,V,V> remappingFunction)
            Метод compute - позволяет вычислить новое значение для указанного ключа,
            используя новую функцию пересчёта.
            Новое значение может зависеть от текущего ключа и текущего значения.
             */
            // oldValue == result.get(word)
            //result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
            /*
             Лямбда выражение - это анонимная функция (это реализация какого то
             метода в интерфейсе)
            */
            //     result.put(word1);
            //     result.put(word,oldValue +1);

            //  У этого метода есть два разделения:
            // первое разделение:
            // Вычисляет новое значение, ТОЛЬКО ЕСЛИ ключу было ассоциировано какое - то не - null значение.
            result.computeIfPresent(word, (key, Value) -> Value + 1);

            // Второе разделение:
            // Метод вычисляет новое значение для ключа, ТОЛЬКО ЕСЛИ ключу ещё не присутствует в карте (или возвращает null).
            result.computeIfAbsent(word, key -> 1);
            //   result.computeIfAbsent(word, key -> 1000);
            // put(word,1);

        }
        return result;

    }

    // "Option 5:" метод merge

    private static Map<String, Integer> frequencyDictionary5(String text) {
        // 1. Поместить в какую - то коллекцию слова, которые встречаются в тексте.
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");
        // 2. Создать карту вхождений слова в тексте -> ключ слово, значение количество вхождений
        Map<String, Integer> result = new HashMap<>();
        // 3. Перебрать коллекцию слов и добавить в карту.
        for (String word : words) {
           /*
           merge (K key, V value, BiFunction<K,V,V> remappingFunction)
           Метод merge - используется для объединения значения для указанного ключа.
           Если ключа нет в карте, то он будет добавлен с указанным значением.
           Как работает?

           - Если ключа не существует(или метод гет возвращает null), то новое значение будет вставляться в карту
           - Если ключ уже существует(вернул не null) применится функция объединения,
            которая может использовать старое и новое значение.
           - Если функция вернёт null - пара удалится (или запишется)
            */

            result.merge(word,1,(oldValue, myValue) -> oldValue + myValue);
         //   result.merge(word,1, Integer::sum); лямбда выражение


        }
        return result;

    }
}