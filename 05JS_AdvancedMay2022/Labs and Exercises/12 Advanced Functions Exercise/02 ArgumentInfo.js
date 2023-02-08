function solve() {
    let obj = {};
    Array.from(arguments).forEach(element => {
        let type = typeof element;
        console.log(`${type}: ${element}`);
        if (!obj[type]) {
            obj[type] = 0
        }
        obj[type]++;
    });
    Object.entries(obj).sort((a, b) => b[1] - a[1]).forEach((e) => console.log(`${e[0]} = ${e[1]}`));
}
solve('cat', 20,0, 42, function () { console.log('Hello world!'); });