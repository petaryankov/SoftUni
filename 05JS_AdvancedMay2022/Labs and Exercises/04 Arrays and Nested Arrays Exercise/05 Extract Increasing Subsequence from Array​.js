function solve(arr) {
    let result = [arr[0]];
    let maxNum = arr[0];
    for (let i = 0; i < arr.length - 1; i++) {
        const secondEl = arr[i + 1];
        if (maxNum <= secondEl) {
            result.push(secondEl);
            maxNum = secondEl;
        }
    }
    return result;

}
console.log(solve([20, 3, 2, 15, 6, 1]));