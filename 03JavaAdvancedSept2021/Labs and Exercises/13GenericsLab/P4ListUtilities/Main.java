package day15.GenericsLab.P4.ListUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integers = List.of(1, 7, 15, 22);
        List<String> a = List.of("a", "b", "c");
        System.out.println(ListUtils.getMin(integers));
        System.out.println(ListUtils.getMax(integers));
        System.out.println(ListUtils.getMin(a));
        System.out.println(ListUtils.getMax(a));
        List<Integer> empty = new ArrayList<>();
        ListUtils.getMin(empty);
    }
}
