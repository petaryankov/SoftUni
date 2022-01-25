package day8.StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P7MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String inputOne = "D:\\Pepi\\Programirane\\Java\\SoftUni\\JavaAdvancedSept2021" +
                "\\Documents\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\inputOne.txt";
        String inputTwo = "D:\\Pepi\\Programirane\\Java\\SoftUni\\JavaAdvancedSept2021" +
                "\\Documents\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\inputTwo.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("mergeTwo.txt"));
        Files.readAllLines(Path.of(inputOne)).forEach(e -> {
            try {
                writer.write(e + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        Files.readAllLines(Path.of(inputTwo)).forEach(e -> {
            try {
                writer.write(e + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        writer.close();
    }
}
