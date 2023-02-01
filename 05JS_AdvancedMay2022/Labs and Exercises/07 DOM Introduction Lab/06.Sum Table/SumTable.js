function sumTable() {
    let products = document.querySelectorAll('tr td:nth-of-type(2)');
    
    let sum = 0;
    for (let i = 0; i < products.length - 1; i++) {
        const element = Number(products[i].textContent);
        sum += element;
    }
    document.getElementById('sum').textContent = sum;
}