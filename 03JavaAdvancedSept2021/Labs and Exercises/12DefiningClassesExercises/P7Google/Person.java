package day12.DefiningClassesExercises.P7Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Children> children;
    private List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        parents = new ArrayList<>();
        children = new ArrayList<>();
        pokemons = new ArrayList<>();
    }

    public void addCompany(Company company) {
        this.company = company;
    }

    public void addCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Children> getChildren() {
        return this.children;
    }

    public List<Parent> getParent() {
        return this.parents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n")
                .append("Company:").append("\n");
        if (company != null) {
            sb.append(company).append("\n");
        }
        sb.append("Car:").append("\n");
        if (car != null) {
            sb.append(car).append("\n");
        }
        sb.append("Pokemon:").append("\n");
        if (!pokemons.isEmpty()) {
            pokemons.forEach(e-> sb.append(e).append("\n"));
        }
        sb.append("Parents:").append("\n");
        if (!parents.isEmpty()) {
            parents.forEach(e-> sb.append(e).append("\n"));
        }
        sb.append("Children:").append("\n");
        if (!children.isEmpty()) {
            children.forEach(e-> sb.append(e).append("\n"));
        }
        return sb.toString();
    }
}
