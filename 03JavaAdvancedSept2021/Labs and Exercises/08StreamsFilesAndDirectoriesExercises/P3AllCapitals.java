package day8.StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class P3AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni" +
                "\\JavaAdvancedSept2021\\Documents" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer = new BufferedWriter
                (new FileWriter("allCapitals"));
        Files.readAllLines(Path.of(path)).forEach(str -> {
            try {
                writer.write(str.toUpperCase());
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();

    }
}
