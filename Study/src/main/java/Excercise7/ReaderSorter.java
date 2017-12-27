package Excercise7;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class ReaderSorter {
    public static void main(String[] args) throws IOException {
        String[] wordBlob = new String[0];
        String string;

        //Чтение из файла
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/Excercise7/File.txt"));
        while ((string = br.readLine()) != null) {
            wordBlob = string.split("\\s+");
        }

        //подсчет повторений
        HashMap<String, Integer> wordsStatistics = new HashMap<>();
        for (String a : wordBlob) {
            if (!wordsStatistics.containsKey(a)) {
                wordsStatistics.put(a, 0);
            }
            wordsStatistics.put(a, wordsStatistics.get(a) + 1);
        }

        // Сортировка по алфавиту.
        Arrays.sort(wordBlob);
        System.out.println("Отсортированный список:");
        for (String b : wordBlob)
            System.out.println(b);

        //Подсчет повторений
        System.out.println("Повторения слов:");
        for (String с : wordsStatistics.keySet()) {
            System.out.println("Слово " + с + " повторяется " + wordsStatistics.get(с) + " раз.");
        }

        //слово с максимальным количеством повторений.
        HashMap.Entry<String, Integer> mostFrequentWord = null;
        for (HashMap.Entry<String, Integer> entry : wordsStatistics.entrySet()) {
            if (mostFrequentWord == null || entry.getValue().compareTo(mostFrequentWord.getValue()) > 0) {
                mostFrequentWord = entry;
            }
        }
        System.out.println("Слово с максимальным количеством повторений: " + mostFrequentWord);


    }
}
