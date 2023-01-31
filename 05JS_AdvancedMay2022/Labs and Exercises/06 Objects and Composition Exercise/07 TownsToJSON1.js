function solve(arr) {
    let result = [];
    let town = {};

    for (let i = 1; i < arr.length; i++) {
        let line = arr[i].split('|').map(el => el.trim())
            .filter(el => el.length !== 0);

        let townName = line[0];
        let latitude = Number(line[1]).toFixed(2);
        latitude = Number(latitude);
        let longitude = Number(line[2]).toFixed(2);
        longitude = Number(longitude);
        town = { Town: townName, Latitude: latitude, Longitude: longitude };
        result.push(town)

    }
    return JSON.stringify(result);

}
solve([
    '| Town | Latitude | Longitude |',
    '| Veliko Turnovo | 43.0757 | 25.6172 |',
    '| Monatevideo | 34.50 | 56.11 |']
);