package day8.StreamsFilesAndDirectoriesExercises;

import java.io.File;

public class P8GetFolderSize {
    public static void main(String[] args) {
        String path = "D:\\Pepi\\Programirane" +
                "\\Java\\SoftUni\\JavaAdvancedSept2021\\Documents" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\Exercises Resources";
        File folder = new File(path);

        int folderSize = 0;
        for (File file : folder.listFiles()) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);

    }
}


