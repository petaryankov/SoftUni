function solve(arr) {
    let counter = 0;
    for (let rowIndex = 0; rowIndex < arr.length; rowIndex++) {
        let row = arr[rowIndex];
        for (let colIndex = 0; colIndex < row.length; colIndex++) {
            let col = row[colIndex];
 
            if (rowIndex !== arr.length - 1) {
                if (col === row[colIndex + 1]) {
                    counter++;
                }
                if (col === arr[rowIndex + 1][colIndex]) {
                    counter++;
                }
            }
            else if (col === row[colIndex + 1] || col === arr[rowIndex][colIndex + 1]) {
                counter++;
            }
        }
    }
    console.log(counter);
}
solve([['test', 'yes', 'yo', 'ho'],
['well', 'done', 'yo', '6'],
['not', 'done', 'yet', '5']]
);