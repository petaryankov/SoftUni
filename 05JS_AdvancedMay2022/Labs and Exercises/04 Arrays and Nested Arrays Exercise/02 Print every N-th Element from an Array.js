function solve(arr, step) {
    return arr.filter((element, index) => index % step == 0)
}
console.log(solve(['dsa',
    'asd',
    'test',
    'tset'],
    2
));