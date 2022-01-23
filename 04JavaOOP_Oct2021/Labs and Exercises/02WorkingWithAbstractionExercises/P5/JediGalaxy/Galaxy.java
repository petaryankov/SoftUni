package day2.WorkingWithAbstractionExercises.P5.JediGalaxy;
public class Galaxy {
    private Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public void moveEvil(int row, int col) {
        while (row >= 0 && col >= 0) {
            if (this.field.isInBound(row, col)) {
                field.setMatrixValue(row, col, 0);
            }
            row--;
            col--;
        }
    }

    public long moveJedi(int row, int col) {
        long starsCollected = 0;
        while (row >= 0 && col < field.getMatrixColLength(1)) {
            if (field.isInBound(row, col)) {
                starsCollected += field.getMatrixValue(row, col);
            }

            col++;
            row--;
        }
        return starsCollected;
    }
}
