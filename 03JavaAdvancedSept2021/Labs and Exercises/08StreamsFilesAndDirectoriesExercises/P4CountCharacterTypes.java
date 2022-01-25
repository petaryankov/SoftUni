package day8.StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class P4CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni" +
                "\\JavaAdvancedSept2021\\Documents" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter("countChars.txt"));
        List<String> lines = Files.readAllLines(Path.of(path));
        Set<Character> punctuation = Set.of(',', '.', '!', '?');
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int vowelsCount = 0;
        int consCount = 0;
        int punCount = 0;
        for (String line : lines) {
            String[] lineArr = line.split("\\s+");
            for (String word : lineArr) {
                for (int index = 0; index < word.length(); index++) {
                    char symbol = word.charAt(index);
                    if (punctuation.contains(symbol)) {
                        punCount++;
                    } else if (vowels.contains(symbol)) {
                        vowelsCount++;
                    } else {
                        consCount++;
                    }
                }
            }
        }

        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Consonants: " + consCount);
        writer.newLine();
        writer.write("Punctuation: " + punCount);
        writer.close();
    }
}
