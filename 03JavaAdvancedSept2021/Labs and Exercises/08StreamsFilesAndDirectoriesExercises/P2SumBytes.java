package day8.StreamsFilesAndDirectoriesExercises;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P2SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni" +
                "\\JavaAdvancedSept2021\\Documents" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
                    long sum = 0;
        List<String> line = Files.readAllLines(Path.of(path));
        for (String s : line) {

            for (int i = 0; i < s.length(); i++) {
                char symbol = s.charAt(i);
                sum+= symbol;
            }
        }
        System.out.println(sum);




    }
}
