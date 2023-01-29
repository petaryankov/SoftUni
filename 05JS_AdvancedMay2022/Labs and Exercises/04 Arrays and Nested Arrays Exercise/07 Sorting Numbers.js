function solve(numbers) {
    numbers.sort((a, b) => a - b);
    let result = [];
    while (numbers.length !== 0) {
        result.push(numbers.shift())
        result.push(numbers.pop())
    }
    return result;
}
//[-3, 1, 3, 18, 31, 48, 52, 56, 63, 65]
console.log(solve([1, 65, 3, 52, 48, 63, 31, -3, 18, 56]));