package day5.InheritanceLab.P5.StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }
    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        int lastIndex = this.data.size() - 1;
        return this.data.remove(lastIndex);
    }

    public  String peek() {
        int lastIndex = this.data.size() - 1;
        return this.data.get(lastIndex);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
