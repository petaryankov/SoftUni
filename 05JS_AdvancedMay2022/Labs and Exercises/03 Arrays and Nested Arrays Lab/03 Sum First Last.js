function solve(arr) {
    let arrFirst = Number(arr.shift());
    let arrLast = Number(arr.pop());
    return arrFirst + arrLast;
}
console.log(solve(['5', '10']));