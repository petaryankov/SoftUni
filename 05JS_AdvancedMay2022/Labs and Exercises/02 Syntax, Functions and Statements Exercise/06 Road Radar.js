function solve(speed, area) {
    let moterwayLimit = 130;
    let interstateLimit = 90;
    let cityLimit = 50;
    let residentialLimit = 20;
    let result = '';
    let overspeed;
    let status = '';
    switch (area) {

        case 'motorway':
            result = resultFunc(speed, moterwayLimit);
            break;
        case 'interstate':
            result = resultFunc(speed, interstateLimit);
            break;
        case 'city':
            result = resultFunc(speed, cityLimit);
            break;
        case 'residential':
            result = resultFunc(speed, residentialLimit);
            break;

    }
    function resultFunc(speed, speedLimit) {
        if (speed > speedLimit) {
            overspeed = speed - speedLimit;
            status = stausFunc(overspeed);
            return `The speed is ${overspeed} km/h faster than the allowed speed of ${speedLimit} - ${status}`;
        } else {
            return `Driving ${speed} km/h in a ${speedLimit} zone`;
        }
    }
    function stausFunc(overspeed) {
        if (overspeed <= 20) {
            return 'speeding';
        } else if (overspeed <= 40) {
            return 'excessive speeding';
        } else {
            return 'reckless driving';
        }

    }
    console.log(result);

}
solve(21, 'residential');