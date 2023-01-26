function solve(number) {
    let result = '';
    for (let row = 0; row < number; row++) {
        for (let col = 0; col < number; col++) {
            result += '* ';   
        }
        console.log(result);
        result = '';
    }
}