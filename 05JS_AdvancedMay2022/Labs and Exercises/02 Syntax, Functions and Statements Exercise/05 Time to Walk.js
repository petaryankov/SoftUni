function solve(steps, footLength, speed) {

    let distanceKm = steps * footLength / 1000;
    let hourse = distanceKm / speed;
    let addedMinutes = Math.floor(distanceKm / 0.5);
    let minutes = (hourse * 60) + addedMinutes;
    let seconds = (minutes - Math.floor(minutes)) * 60;

    let toPrintHours = Math.floor(hourse).toFixed(0).padStart(2, '0');
    let toPrintMinutes = Math.floor(minutes).toFixed(0).padStart(2, '0');
    let toPrintSeconds = seconds.toFixed(0).padStart(2, '0');
    
    console.log(`${toPrintHours}:${toPrintMinutes}:${toPrintSeconds}`);

}
solve(4000, 0.60, 5);