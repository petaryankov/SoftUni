package day11NestedLoopsLab;

public class P2MultiplicationTable {
    public static void main(String[] args) {

        int result = 0;
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                result = x * y;
                System.out.printf("%d * %d = %d\n", x, y, result);
            }
        }
    }
}
