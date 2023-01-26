package day15.GenericsLab.P1.JarOfT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jar<Integer> jar = new Jar<>();
        jar.add(13);
        jar.add(22);
        jar.remove();

    }
}
