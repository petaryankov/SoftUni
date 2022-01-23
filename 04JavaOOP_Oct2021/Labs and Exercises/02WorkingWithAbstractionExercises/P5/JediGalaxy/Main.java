//package workingWithAbstraction.jediGalaxy;
package day2.WorkingWithAbstractionExercises.P5.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = reedPositions(scanner.nextLine());
        int row = dimensions[0];
        int col = dimensions[1];

        Field  field = new Field(row, col);
        Galaxy galaxy = new Galaxy(field);

        String command = scanner.nextLine();
        long starsCollected = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = reedPositions(command);
            int[] evilPosition = reedPositions(scanner.nextLine());
            int rowEvil = evilPosition[0];
            int colEvil = evilPosition[1];

            galaxy.moveEvil(rowEvil, colEvil);

            int rowJedi = jediPosition[0];
            int colJedi = jediPosition[1];

            starsCollected = galaxy.moveJedi(rowJedi, colJedi);

            command = scanner.nextLine();
        }

        System.out.println(starsCollected);

    }

    private static int[] reedPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
