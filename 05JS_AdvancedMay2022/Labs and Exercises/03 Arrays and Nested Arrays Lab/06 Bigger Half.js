<<<<<<< HEAD
function solve(arr) {
    arr.sort((a, b) => a - b);
    return arr.slice(Math.floor(arr.length / 2));
}
console.log(solve([4, 7, 2, 5]));
=======
function solve(arr) {
    arr.sort((a, b) => a - b);
    return arr.slice(Math.floor(arr.length / 2));
}
console.log(solve([4, 7, 2, 5]));
>>>>>>> 15f03926135640e135390693a10a729a469de9ef
console.log(solve([3, 19, 14, 7, 2, 19, 6]));