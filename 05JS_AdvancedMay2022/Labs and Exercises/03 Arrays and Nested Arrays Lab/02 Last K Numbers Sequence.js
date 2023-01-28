function solve(n, k) {
    let arrLength = n;
    let arr = [1];

    for (let index = 1; index < arrLength; index++) {
        let sum = 0;
        let currentIndex = index - 1;
        let arrCount = k;
        while (arrCount-- > 0) {
            sum += arr[currentIndex]
            currentIndex--;
            if (currentIndex < 0) {
                break;
            }
        }
        arr.push(sum);

    }
    return arr;
}
console.log(solve(6, 3));;