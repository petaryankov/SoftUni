function solve(arr) {

    console.log(arr
    .filter((v, i) => i % 2 != 0)
    .map(num => num * 2)
    .reverse()
    .join(' '));
}
solve([3, 0, 10, 4, 7, 3]);