function townPopulation(arr) {
    const result = {};

    for (const town of arr) {
        const townName = town.split('<->')[0];
        const townPopulation = Number(town.split('<->')[1]);

        if (result[townName] == undefined) {
            result[townName] = townPopulation;
        } else {
            result[townName] += townPopulation;
        }
    }
    for (const town in result) {

        console.log(`${town}: ${result[town]}`);
    }
}

townPopulation(['Istanbul <-> 100000',
    'Honk Kong <-> 2100004',
    'Jerusalem <-> 2352344',
    'Mexico City <-> 23401925',
    'Istanbul <-> 1000']
);