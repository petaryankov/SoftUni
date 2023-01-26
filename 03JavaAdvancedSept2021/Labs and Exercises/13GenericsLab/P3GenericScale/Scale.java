package day15.GenericsLab.P3.GenericScale;

public class Scale<T extends Comparable<T>> {
    T left;
    T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        if (left.equals(right)) {
            return null;
        }
        int result = left.compareTo(right);
        return result > 0 ? left : right;
    }
}
