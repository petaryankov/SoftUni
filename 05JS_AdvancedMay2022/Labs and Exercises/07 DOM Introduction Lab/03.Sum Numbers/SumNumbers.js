function calc() {
    // TODO: sum = num1 + num2
    let firsNumEl = document.getElementById('num1');
    let firstNum = Number(firsNumEl.value);
    let secondNumEl = document.getElementById('num2');
    let secondNum = Number(secondNumEl.value)
    let sum = firstNum + secondNum;
    let result = document.getElementById('sum');
    result.value = sum;
}
