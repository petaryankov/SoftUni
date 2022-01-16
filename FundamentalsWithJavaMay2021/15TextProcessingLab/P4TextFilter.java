package day16TextProcessingLab;

import java.util.Scanner;

public class P4TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banKeys = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banKey : banKeys) {
            text = text.replace(banKey, "*".repeat(banKey.length()));
        }
        System.out.println(text);
    }
}
