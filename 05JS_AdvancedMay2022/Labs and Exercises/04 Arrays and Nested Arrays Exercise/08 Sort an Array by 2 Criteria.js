function solve(arr) {

    arr.sort(twoCriteria);
    function twoCriteria(a, b) {
        return a.length === b.length ? a.localeCompare(b)
            : a.length - b.length;
    }
    console.log(arr.join('\n'));
}
solve(['alpha', 
'beta', 
'gamma']
);