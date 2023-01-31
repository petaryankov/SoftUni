function solve(arr) {
    let result = [];

    class Town {
        constructor(town, latitude, longitude) {
            this.Town = town;
            this.Latitude = Number(latitude);
            this.Longitude = Number(longitude);
        }
    }
    for (let i = 1; i < arr.length; i++) {
        let currentArr = arr[i].split('|')
            .map(el => el.trim()).filter(e => e.length != 0);
        let town = currentArr[0];
        let latitude = Number(currentArr[1]).toFixed(2);
        let longitude = Number(currentArr[2]).toFixed(2);
        let currenTown = new Town(town, latitude, longitude);
        result.push(currenTown);
    }
    return JSON.stringify(result);
}

solve(['| Town | Latitude | Longitude |',
    '| Sofia | 42.696552 | 23.32601 |',
    '| Beijing | 39.913818 | 116.363625 |']
);
