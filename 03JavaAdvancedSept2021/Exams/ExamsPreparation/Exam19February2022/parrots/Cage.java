package ExamsPreparation.Exam19February2022.parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
    public void add(Parrot parrot) {
        if (data.size() < getCapacity()) {
            data.add(parrot);
        }
    }
    public boolean	remove(String name) {
        for (Parrot parrot : data) {
            if (parrot.getName().equals(name)) {
                data.remove(parrot);
                return true;
            }
        }
        return false;
    }
    public Parrot sellParrot(String name) {
        Parrot sold = null;
        for (Parrot parrot : data) {
            if (parrot.getName().equals(name)) {
                parrot.setAvailable(false);
                sold = parrot;
                data.remove(parrot);
                break;
            }
        }
        return sold;
    }
    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> soldSpecies = new ArrayList<>();
        this.data.stream().filter(e -> e.getSpecies().equals(species))
                .forEach(soldSpecies::add);
        soldSpecies.forEach(p-> this.data.remove(p));
        return soldSpecies;
    }
    public int count() {
        return data.size();
    }

    public String report() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Parrots available at %s:\n", this.name));
        data.forEach(e-> result.append(e).append(System.lineSeparator()));
        return result.toString().trim();
    }
}
