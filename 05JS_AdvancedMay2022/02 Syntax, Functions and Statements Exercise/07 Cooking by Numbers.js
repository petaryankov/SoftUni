function solve(strNum, ...str) {
    let number = Number(strNum);
    for (let index = 0; index < str.length; index++) {
        let command = str[index];
        switch (command) {
            case 'chop':
                number /= 2;
                break;
            case 'dice':
                number = Math.sqrt(number);
                break;
            case 'spice':
                number += 1;
                break;
            case 'bake':
                number *= 3;
                break;
            case 'fillet':
                number = number - (number * 0.2);
                break;
        }
        console.log(number);

    }

}
solve('9', 'dice', 'spice', 'chop', 'bake', 'fillet');