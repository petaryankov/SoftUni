class OnlineShop {
    constructor(warehouseSpace) {
        this.warehouseSpace = warehouseSpace;
        this.products = [];
        this.sales = [];
    }
    loadingStore(product, quantity, spaceRequired) {
        if (this.warehouseSpace < spaceRequired) {
            throw new Error('Not enough space in the warehouse.');
        }
        //?? names of product
        this.products.push({ product, quantity });
        this.warehouseSpace -= spaceRequired;
        return `The ${product} has been successfully delivered in the warehouse.`
    }
    quantityCheck(product, minimalQuantity) {
        let currentProduct = this.products.find(e => e.product === product);

        if (currentProduct === undefined) {
            throw new Error(`There is no ${product} in the warehouse.`);
        }
        if (minimalQuantity <= 0) {
            throw new Error('The quantity cannot be zero or negative.');
        }
        if (minimalQuantity <= currentProduct.quantity) {
            return `You have enough from product ${product}.`;
        } else {
            let difference = minimalQuantity - currentProduct.quantity;
            currentProduct.quantity = minimalQuantity;
            return `You added ${difference} more from the ${product} products.`;
        }
    }
    sellProduct(product) {
        let currentProduct = this.products.find(e => e.product === product);
        if (currentProduct === undefined) {
            throw new Error(`There is no ${product} in the warehouse.`)
        }
        currentProduct.quantity--;
        this.sales.push({product, quantity: 1});// ???
        return `The ${product} has been successfully sold.`
    }
    revision() {
        let result = [];
        let lengthSales = this.sales.length;
        if (lengthSales === 0) {
            throw new Error('There are no sales today!');
        } else {
            result.push(`You sold ${lengthSales} products today!`);
            result.push('Products in the warehouse:');
            this.products.forEach(e => {
                result.push(`${e.product}-${e.quantity} more left`);
            });
        }
        return result.join('\n');
    }
}
const myOnlineShop = new OnlineShop(500)
console.log(myOnlineShop.loadingStore('headphones', 10, 200));
console.log(myOnlineShop.loadingStore('laptop', 5, 200));

console.log(myOnlineShop.quantityCheck('headphones', 10));
console.log(myOnlineShop.quantityCheck('laptop', 10));

console.log(myOnlineShop.sellProduct('headphones'));
console.log(myOnlineShop.sellProduct('laptop'));
console.log(myOnlineShop.revision());


