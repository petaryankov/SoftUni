package day15.GenericsLab.P3.GenericScale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(new Scale(2, 8).getHeavier());
        System.out.println(new Scale("g", "t").getHeavier());
        System.out.println(new Scale("g", "g").getHeavier());

    }
//    public static <T extends Comparable<T>> T getHeavier(T left, T right) {
//        int result = left.compareTo(right);
//        return result >= 0 ? left : right;
//    }
}
