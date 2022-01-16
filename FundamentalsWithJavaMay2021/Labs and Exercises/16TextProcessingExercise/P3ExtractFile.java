package day17TextProcessingExercise;

import java.util.Scanner;

public class P3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int slashIndex = input.lastIndexOf('\\');
        int dotIndex = input.indexOf('.');
        String fileName = input.substring(slashIndex + 1, dotIndex);
        System.out.println("File name: " + fileName);
        String fileType = input.substring(dotIndex + 1);
        System.out.println("File extension: " + fileType);

    }
}
