function solve(fruit, weight, price) {
    let weightInKg = weight / 1000;
    let money = (weightInKg * price).toFixed(2);
    
    console.log(`I need $${money} to buy ${weightInKg.toFixed(2)} kilograms ${fruit}.`);
}
solve('apple', 1563, 2.35);