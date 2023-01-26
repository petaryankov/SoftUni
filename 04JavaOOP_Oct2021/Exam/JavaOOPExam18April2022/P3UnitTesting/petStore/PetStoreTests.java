package petStore;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetStoreTests {
    PetStore petStore = new PetStore();

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnimalIllegalArgumentException() {
        petStore.addAnimal(null);
    }

    @Test
    public void testGetTheMostExpensiveAnimal() {
        Animal animal = new Animal("test_species", 10, 100);
        petStore.addAnimal(animal);
        Assert.assertEquals(animal, petStore.getTheMostExpensiveAnimal());
    }

    @Test
    public void testFindAllAnimalBySpecie() {
        Animal animal1 = new Animal("test_species_1", 10, 100);
        Animal animal2 = new Animal("test_species_2", 15, 200);
        petStore.addAnimal(animal1);
        petStore.addAnimal(animal2);
        List<Animal> expected = new ArrayList<>();
        expected.add(animal1);
        Assert.assertEquals(expected, petStore.findAllAnimalBySpecie("test_species_1"));
    }

    @Test
    public void testFindAllAnimalsWithMaxKilograms() {
        Animal animal1 = new Animal("test_species_1", 10, 100);
        Animal animal2 = new Animal("test_species_2", 2, 200);
        petStore.addAnimal(animal1);
        petStore.addAnimal(animal2);
        List<Animal> expected = new ArrayList<>();
        expected.add(animal1);
        Assert.assertEquals(expected, petStore.findAllAnimalsWithMaxKilograms(5));
    }
}

