package day16TextProcessingLab;

import java.util.Scanner;

public class P3Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();

        while (secondStr.contains(firstStr)) {
            secondStr = secondStr.replace(firstStr, "");
        }
        System.out.println(secondStr);
    }
}
