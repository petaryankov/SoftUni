package day16.GenericsExercises.P8.CustomListSorter;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {
        for (int i = 0; i < customList.size(); i++) {
            T element1 = customList.getElement(i);
            for (int j = i + 1; j < customList.size(); j++) {
                T element2 = customList.getElement(j);
                if (element1.compareTo(element2) > 0) {
                    customList.swap(i, j);
                }
            }
        }
    }
}
