package sanctuary;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Habitat {
    private List<Elephant> data;
    private int capacity;

    public Habitat(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void add(Elephant elephant) {
        if (data.size() < capacity) {
            data.add(elephant);
        }
    }

    public boolean remove(String name) {
        for (Elephant elephant : data) {
            if (elephant.getName().equals(name)) {
                data.remove(elephant);
                return true;
            }
        }
        return false;
    }

    public Elephant getElephant(String retiredFrom) {
        Elephant rElephant = null;
        for (Elephant elephant : data) {
            if (elephant.getRetiredFrom().equals(retiredFrom)) {
                rElephant = elephant;
            }
        }
        return rElephant;
    }

    public Elephant getOldestElephant() {
        Elephant oldestElephant = null;
        int maxAge = -1;
        for (Elephant elephant : data) {
            if (elephant.getAge() > maxAge) {
                oldestElephant = elephant;
                maxAge = elephant.getAge();
            }
        }
        return oldestElephant;
    }

    public int getAllElephants() {
        return data.size();
    }

    public String getReport() {
        StringBuilder result = new StringBuilder();
        result.append("Saved elephants in the park:\n");
        data.forEach(e-> result.append(String.format
                ("%s came from: %s\n", e.getName(), e.getRetiredFrom())));
        return result.toString().trim();
    }
}
