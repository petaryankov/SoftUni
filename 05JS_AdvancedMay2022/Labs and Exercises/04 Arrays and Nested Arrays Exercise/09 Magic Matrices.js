function solve(matrix) {
    let isMagic = true;

    for (let row = 0; row < matrix.length - 1; row++) {
        let currentRowSum = matrix[row].reduce((a, b) => a + b, 0);
        let nextRowSum = matrix[row + 1].reduce((a, b) => a + b, 0);
        let currentColSum = 0;
        let nextColSum = 0;

        for (let col = 0; col < matrix.length; col++) {
            currentColSum += matrix[row][col];
            nextColSum += matrix[row + 1][col];
        }
        if (currentRowSum !== nextRowSum || currentColSum !== nextColSum) {
            isMagic = false;
        }
    }
    return isMagic;
}
console.log(solve([[4, 5, 6],
[6, 5, 4],
[5, 5, 5]]
));