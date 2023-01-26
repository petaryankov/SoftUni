package day15.GenericsLab.P2.GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {
        T[] arr = (T[]) Array.newInstance(item.getClass(), length);
        Arrays.fill(arr, item);
        return arr;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item) {
        T[] arr = (T[])Array.newInstance(clazz, length);
        Arrays.fill(arr, item);
        return arr;
    }
}
