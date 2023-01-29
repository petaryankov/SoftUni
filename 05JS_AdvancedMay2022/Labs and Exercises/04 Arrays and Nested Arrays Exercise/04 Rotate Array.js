function solve(arr, rotation) {
    for (let i = 0; i < rotation; i++) {
        arr.unshift(arr.pop());
    }
    console.log(arr.join(' '));
}
solve(['Banana',
    'Orange',
    'Coconut',
    'Apple'],
    15
);