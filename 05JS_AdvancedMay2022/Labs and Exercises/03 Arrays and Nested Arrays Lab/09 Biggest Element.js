function solve(arr) {
    let maxNum = - Infinity;
    for (let row = 0; row < arr.length; row++) {
        let currentMax = Math.max(...arr[row]);
        if (currentMax > maxNum) {
            maxNum = currentMax;
        }
    }
    return maxNum;
}
console.log(solve([[20, 50, 10],
[8, 33, 145]]
));