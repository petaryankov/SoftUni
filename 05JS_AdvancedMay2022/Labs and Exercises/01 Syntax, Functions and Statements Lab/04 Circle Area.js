function circleArea(input) {
    let result;
    let inputType = typeof (input);

    if (inputType === 'number') {
        result = (Math.pow(input, 2) * Math.PI).toFixed(2);
    } else {
        result = `We can not calculate the circle area, because we receive a ${inputType}.`;
    }
    console.log(result);
}
circleArea('name');