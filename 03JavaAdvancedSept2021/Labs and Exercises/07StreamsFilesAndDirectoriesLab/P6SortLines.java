package day7.StreamsFilesAndDirectoriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class P6SortLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\Pepi\\Programirane\\Java\\SoftUni" +
                "\\JavaAdvancedSept2021\\Documents" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\Files-and-Streams\\input.txt");
        List<String> lines = Files.readAllLines(path).stream()
                .filter(l -> !l.isEmpty()).sorted().collect(Collectors.toList());
        Files.write(Paths.get("sortLines.txt"), lines);
    }
}
