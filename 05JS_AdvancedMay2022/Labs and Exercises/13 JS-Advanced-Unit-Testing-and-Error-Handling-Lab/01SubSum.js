function solve(arr, start, end) {
    if (Array.isArray(arr) == false) {
        return NaN;
    }
    let startIndex = Math.max(start, 0);
    let endIndex = Math.min(end, arr.length - 1);
    return arr
        .slice(startIndex, endIndex + 1)
        .map(Number)
        .reduce((a, x) => a + x, 0);

}
console.log(solve('text', 0, 2));