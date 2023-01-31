function solve(arr) {
    let sortedArr = arr.sort((a, b) => a.localeCompare(b));
    let charKey = '';

    for (const elements of sortedArr) {
        let [product, price] = elements.split(' : ');

        if (charKey !== product[0]) {
            charKey = product[0];
            console.log(charKey);
        }
        console.log(`${product}: ${price}`);
    }
}
solve(['Appricot : 20.4',
    'Fridge : 1500',
    'TV : 1499',
    'Deodorant : 10',
    'Boiler : 300',
    'Apple : 1.25',
    'Anti-Bug Spray : 15',
    'T-Shirt : 10']
);