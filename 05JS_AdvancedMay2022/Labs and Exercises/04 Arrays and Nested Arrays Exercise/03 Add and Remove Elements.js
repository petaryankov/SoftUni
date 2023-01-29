function solve(command) {
    let number = 0;
    let result = [];
    for (let i = 0; i < command.length; i++) {
        number++;
        command[i] == 'add' ? result.push(number)
            : result.pop();
    }
    result.length == 0 ? console.log('Empty')
        : console.log(result.join('\n'));
}
solve(['add', 
'add', 
'remove', 
'add', 
'add']
);