function solve(input) {
    let result = [];
    obj = {
        add(str) {
            result.push(str);
        },
        remove(str) {
            result = result.filter(e => e !== str);
        },
        print() {
            console.log(result.join(','));
        }
    }
    for (const line of input) {
        if (line.length === 5) {
            obj.print();
        } else {
            let [func, command] = line.split(' ');
            if (func === 'add') {
                obj.add(command);
            } else {
                obj.remove(command);
            }
        }
    }
}
solve(['add hello', 'add again', 'remove hello', 'add again', 'print']);