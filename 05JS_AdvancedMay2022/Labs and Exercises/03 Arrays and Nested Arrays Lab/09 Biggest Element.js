<<<<<<< HEAD
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
=======
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
>>>>>>> 15f03926135640e135390693a10a729a469de9ef
));