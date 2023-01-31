function solve(input) {
    let numbers = [];
    let counterNum = 0;
    let counterNuN = 0;
    for (const el of input) {

        if (typeof (el) === 'number') {
            numbers.push(el);
            counterNum++;
        } else {
            counterNuN++;
            if (numbers.length >= 2) {
                counterNuN--;
                counterNum -= 2;
                let secondNumber = numbers.pop();
                let firstNumber = numbers.pop();
                let operand = el;
                let result;
                switch (operand) {
                    case '+': result = firstNumber + secondNumber
                        break;
                    case '-': result = firstNumber - secondNumber;
                        break;
                    case '*': result = firstNumber * secondNumber
                        break;
                    case '/': result = firstNumber / secondNumber
                        break;
                }
                numbers.push(result);
            }
        }
    }
    if (numbers.length === 1 && counterNuN === 0) {
        console.log(numbers[0]);
    } else if (counterNum > counterNuN) {
        console.log('Error: too many operands!');
    } else {
        console.log('Error: not enough operands!');
    }
}