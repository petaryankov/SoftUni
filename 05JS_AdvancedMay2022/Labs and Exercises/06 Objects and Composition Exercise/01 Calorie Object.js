function solve(arr) {
    const obj = {};
    for (let index = 0; index < arr.length; index += 2) {
        const product = arr[index];
        const calories = arr[index + 1];
        obj[product] = Number(calories);
        
    }
    console.log(obj);
}
solve(['Yoghurt', '48', 'Rise', '138', 'Apple', '52']);