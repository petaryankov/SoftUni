package day8.StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P5LineNumbers {
    public static int countRow = 1;
    public static void main(String[] args) throws IOException {
        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni\\JavaAdvancedSept2021" +
                "\\Documents\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\inputLineNumbers.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("lineNumbers.txt"));
        Files.readAllLines(Path.of(path))
                .forEach(line -> {
                    try {
                        writer.write(countRow++ + ". " + line + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });


//        for (String line : lines) {
//            writer.write(counter + ". " + line);
//            writer.newLine();
//            counter++;
//        }
        writer.close();
    }
}
