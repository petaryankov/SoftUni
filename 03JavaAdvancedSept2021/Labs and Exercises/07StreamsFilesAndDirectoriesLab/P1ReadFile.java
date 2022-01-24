package day7.StreamsFilesAndDirectoriesLab;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P1ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni\\JavaAdvancedSept2021" +
                "\\Documents\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);

        try {
            int charReader = fileStream.read();
            while (charReader != -1) {
                System.out.print(Integer.toBinaryString(charReader) + " ");
                charReader = fileStream.read();
            }
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
