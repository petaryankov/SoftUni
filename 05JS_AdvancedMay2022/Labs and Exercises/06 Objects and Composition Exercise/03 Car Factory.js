function solve(orderedCar) {
    let engines = [{ power: 90, volume: 1800 }, { power: 120, volume: 2400 }, { power: 200, volume: 3500 }];
    let carriages = [{ type: 'hatchback', color: orderedCar.color }, { type: 'coupe', color: orderedCar.color }]
    let wheelsize = orderedCar.wheelsize % 2 == 1 ? orderedCar.wheelsize : orderedCar.wheelsize - 1;
    return {
        model: orderedCar.model,
        engine: engines.filter(e => e.power >= orderedCar.power)[0],
        carriage: carriages.filter(e => e.type == orderedCar.carriage)[0],
        wheels: [wheelsize, wheelsize, wheelsize, wheelsize]
    };
}
/*{ model: 'VW Golf II',
  engine: { power: 90,
            volume: 1800 },
  carriage: { type: 'hatchback',
              color: 'blue' },
  wheels: [13, 13, 13, 13] }
 */
console.log(solve({ model: 'Opel Vectra',
power: 110,
color: 'grey',
carriage: 'coupe',
wheelsize: 17 }
));