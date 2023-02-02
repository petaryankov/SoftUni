function subtract() {
    let firstElement = document.getElementById('firstNumber').value;
    let secondElement = document.getElementById('secondNumber').value;
    let firstNum = Number(firstElement);
    let secondNum = Number(secondElement);
    let result = firstNum - secondNum;
    document.getElementById('result').textContent = result;
}