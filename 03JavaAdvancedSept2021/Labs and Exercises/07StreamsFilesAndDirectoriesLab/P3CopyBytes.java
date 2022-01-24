package day7.StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class P3CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni\\JavaAdvancedSept2021" +
                "\\Documents\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("outASCII.txt");
        PrintStream out = new PrintStream(outputStream);

        int symbol = inputStream.read();
        while (symbol != -1) {
            if (symbol != ' ' && symbol != 10) {
                out.print(symbol);
            } else {
                out.print((char) symbol);
            }

            symbol = inputStream.read();
        }
    }
}
