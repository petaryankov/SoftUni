function solve(arr) {
    let result = {};

    for (const iterator of arr) {
        let [townName, productName, productPrice] = iterator.split(' | ');
        productPrice = Number(productPrice);
        if (!result[productName]) {
            result[productName] = { townName, productPrice };
        } else {
            if (result[productName].productPrice > productPrice) {
                result[productName] = { townName, productPrice }
            }
        }
    }
    let productsName = Object.keys(result);
    for (const product of productsName) {
        console.log(`${product} -> ${result[product].productPrice} (${result[product].townName})`);

    }
}
//Sample Product -> 1000 (Sample Town)
solve(['Sample Town | Sample Product | 1000',
    'Sample Town | Orange | 2',
    'Sample Town | Peach | 1',
    'Sofia | Orange | 3',
    'Sofia | Peach | 2',
    'New York | Sample Product | 1000.1',
    'New York | Burger | 10']
);