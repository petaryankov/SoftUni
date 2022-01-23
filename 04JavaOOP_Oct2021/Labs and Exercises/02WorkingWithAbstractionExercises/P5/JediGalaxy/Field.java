package day2.WorkingWithAbstractionExercises.P5.JediGalaxy;

public class Field {
    private int[][] matrix;

    public Field(int rows, int cols, int beginValue) {
        this.matrix = new int[rows][cols];
        this.fillValue(0);
    }

    public Field(int rows, int cols) {
        this(rows, cols, 0);
    }

    private void fillValue(int beginValue) {
        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < this.matrix[row].length; col++) {
                this.matrix[row][col] = beginValue++;
            }
        }
    }

    public boolean isInBound(int row, int col) {
        return row >= 0 && row < this.matrix.length && col >= 0 && col < this.matrix[row].length;
    }

    public void setMatrixValue(int row, int col, int newValue) {
        this.matrix[row][col] = newValue;
    }

    public long getMatrixValue(int row, int col) {
        return this.matrix[row][col];
    }

    public int getMatrixColLength(int row) {
        return this.matrix[row].length;
    }
}
