package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfKegs = Integer.parseInt(scanner.nextLine());

        float volume = 0;
        float maxVolumeKeg = Float.MIN_VALUE;
        String maxVolumeKegType = "";
        for (int keg = 1; keg <= numOfKegs; keg++) {
            String kegType = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int high = Integer.parseInt(scanner.nextLine());

            volume = (float) (Math.PI * radius * radius * high);
            if ( volume > maxVolumeKeg) {
                maxVolumeKeg = volume;
                maxVolumeKegType = kegType;
            }
        }
        System.out.println(maxVolumeKegType);
    }
}
