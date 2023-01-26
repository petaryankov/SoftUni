function solve(arguments) {
    let sum = 0;
    let inverseSum = 0;
    let concatSum = ''
    for (let i = 0; i < arguments.length; i++) {
        sum += arguments[i];
        inverseSum += 1 / arguments[i];
        concatSum += arguments[i]; 
        
    }
    console.log(sum);
    console.log(inverseSum);
    console.log(concatSum);
}
solve([2, 4, 8, 16]);