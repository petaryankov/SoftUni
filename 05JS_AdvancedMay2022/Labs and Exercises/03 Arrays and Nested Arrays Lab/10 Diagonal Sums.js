<<<<<<< HEAD
function solve(matrix) {

    let sumFirst = 0;
    let sumSecond = 0;
    let firstIndex = 0;
    let secondIndex = matrix.length - 1;
    matrix.forEach(arr => {
        sumFirst += arr[firstIndex++]
        sumSecond += arr[secondIndex--]
    });

    console.log(`${sumFirst} ${sumSecond}`);
}
solve([[3, 5, 17],
[-1, 7, 14],
[1, -8, 89]]
=======
function solve(matrix) {

    let sumFirst = 0;
    let sumSecond = 0;
    let firstIndex = 0;
    let secondIndex = matrix.length - 1;
    matrix.forEach(arr => {
        sumFirst += arr[firstIndex++]
        sumSecond += arr[secondIndex--]
    });

    console.log(`${sumFirst} ${sumSecond}`);
}
solve([[3, 5, 17],
[-1, 7, 14],
[1, -8, 89]]
>>>>>>> 15f03926135640e135390693a10a729a469de9ef
);