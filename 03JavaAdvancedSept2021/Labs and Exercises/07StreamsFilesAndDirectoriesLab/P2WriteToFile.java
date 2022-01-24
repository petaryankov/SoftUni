package day7.StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P2WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni" +
                "\\JavaAdvancedSept2021\\Documents" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "Files-and-Streams\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("out.txt");
            int textChecker = inputStream.read();
            Set<Character> punctuation = Set.of(',', '.', '!', '?');
            while (textChecker != -1) {
                char symbol = (char) textChecker;
                if (!punctuation.contains(symbol)) {
                    outputStream.write(symbol);
                }
                textChecker = inputStream.read();
            }
            outputStream.close();

    }
}
