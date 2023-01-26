package day5.InheritanceLab.P4.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    public E getRandomElement() {
        int start = 0;
        int end = super.size();
        Random random = new Random();
        int randIndex = random.nextInt(end);
        return remove(randIndex);
    }
}
