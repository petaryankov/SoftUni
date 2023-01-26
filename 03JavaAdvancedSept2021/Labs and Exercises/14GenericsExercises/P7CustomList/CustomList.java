package day16.GenericsExercises.P7.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove(int index) {
        return this.elements.remove(index);
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public int size() {
        return this.elements.size();
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(this.elements, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element) {
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return Collections.max(this.elements);
    }

    public T getMin() {
        return Collections.min(this.elements);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : this.elements) {
            sb.append(element).append(System.lineSeparator());
        }
        return sb.toString();
    }

}
