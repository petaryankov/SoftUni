package day18.IteratorsAndComparatorsExercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator implements Iterable {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(String... elements) {
        this.elements = Arrays.asList(elements);
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        return this.currentIndex < this.elements.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public void print() {
        if (this.elements.size() == 0) {
            throw new IllegalStateException("Invalid Operation");
        }
        System.out.println(this.elements.get(currentIndex));
    }

    public void printAll() {
        this.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    @Override
    public Iterator iterator() {
        return new Iterator<String>() {
            private int index;

            @Override
            public boolean hasNext() {
                return this.index < elements.size();
            }

            @Override
            public String next() {
                String element = elements.get(index);
                index++;
                return element;
            }
        };
    }

    @Override
    public void forEach(Consumer action) {
        //Iterable.super.forEach(action);
        this.elements.forEach(action::accept);
    }
}
