function solve(arr) {
    arr.sort((a, b) => a - b);
    console.log(arr.slice(0, 2));
}
solve([30, 15, 50, 5]);