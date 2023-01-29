<<<<<<< HEAD
function solve(arr) {
    let result = [];
    for (const num of arr) {
        if (num < 0) {
            result.unshift(num);
        } else {
            result.push(num);
        }
    }
    console.log(result.join('\n'));
}
=======
function solve(arr) {
    let result = [];
    for (const num of arr) {
        if (num < 0) {
            result.unshift(num);
        } else {
            result.push(num);
        }
    }
    console.log(result.join('\n'));
}
>>>>>>> 15f03926135640e135390693a10a729a469de9ef
solve([3, -2, 0, -1]);