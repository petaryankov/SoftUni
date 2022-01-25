package day8.StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class P6WordCount {
    public static void main(String[] args) throws IOException {
        String wordsPath = "D:\\Pepi\\Programirane\\Java\\SoftUni\\JavaAdvancedSept2021" +
                "\\Documents\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\words.txt";
        String textPath = "D:\\Pepi\\Programirane\\Java\\SoftUni\\JavaAdvancedSept2021" +
                "\\Documents\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\text.txt";
        Map<String, Integer> words = new LinkedHashMap<>();

        BufferedWriter writer = new BufferedWriter(new FileWriter("wordCount"));
        Files.readAllLines(Path.of(wordsPath)).forEach(word -> {
            String[] wordsArr = word.split("\\s+");
            for (String wordArr : wordsArr) {
                words.put(wordArr, 0);
            }
        });
        Files.readAllLines(Path.of(textPath)).forEach(line -> {
            String[] lineWords = line.split("\\s+");
            for (String wordMap : words.keySet()) {
                for (String lineWord : lineWords) {
                    if (wordMap.equals(lineWord)) {
                        words.put(wordMap, words.get(wordMap) + 1);
                    }
                }
            }
        });
        words.forEach((key, value) -> {
            try {
                writer.write(key + " - " + value + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }
}
