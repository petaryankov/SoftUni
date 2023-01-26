package day16.GenericsExercises.P6.GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T elementFirstIndex = this.list.get(firstIndex);
        T elementSecondIndex = this.list.get(secondIndex);
        this.list.set(firstIndex, elementSecondIndex);
        this.list.set(secondIndex, elementFirstIndex);
    }

    public int countOfGreaterItems (T element) {
        return (int) list.stream().filter(e-> e.compareTo(element) > 0).count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t.getClass().getName()).append(": ").append(t).append("\n");
        }
        return sb.toString();
    }
}
