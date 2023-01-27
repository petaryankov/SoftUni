function solve(input) {
    let numbersToString = input.toString();
    let numberToCompare = numbersToString[0];
    let isEqual = true;
    let sum = 0;

    for (let i = 0; i < numbersToString.length; i++) {
        if (numberToCompare !== numbersToString[i]) {
            isEqual = false;
        }
        sum += Number(numbersToString[i]);
    }

    console.log(isEqual);
    console.log(sum)
}
solve(1234);