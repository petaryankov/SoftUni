package day7.StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class P5WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni\\JavaAdvancedSept2021" +
                "\\Documents\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("everyThirdLine.txt");
        PrintStream out = new PrintStream(outputStream);
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
        int counter = 0;
        while (scanner.hasNextLine()) {
            counter++;
            if (counter == 3) {
                out.println(line);
                counter = 0;
            }
        line = scanner.nextLine();
        }

    }
}
