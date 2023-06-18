const {assert} = require('chai');
const chooseYourCar = require('./chooseYourCar');

describe('Choose your car test', () => {
    //•	choosingType (type, color, year)
    it('If the year is less than 1900 and the year is more than 2022, throw an error: "Invalid Year!" ', () => {
        assert.throw(() => {chooseYourCar.choosingType('Sedan', 'blue',1800)}, Error, 'Invalid Year!');
        assert.throw(() => {chooseYourCar.choosingType('Sedan', 'blue',2024)}, Error, 'Invalid Year!');
    });
    it('If the type is different from "Sedan", throw an error: "This type of car is not what you are looking for."', () => {
        assert.throw(() => {chooseYourCar.choosingType('Audi', 'blue',2010)}, Error, 'This type of car is not what you are looking for.');

    });
    it('If the year is greater or equal to 2010, return This ${color} ${type} meets the requirements, that you have.', () => {
        let result = `This ${'blue'} ${'Sedan'} meets the requirements, that you have.`;
        assert.equal(chooseYourCar.choosingType('Sedan', 'blue',2010), result);
        assert.equal(chooseYourCar.choosingType('Sedan', 'blue',2015), result);
        
    });
    it('Otherwise, return the following message:This ${type} is too old for you, especially with that ${color} color.', () => {
        let result = `This ${'Sedan'} is too old for you, especially with that ${'blue'} color.`;
        assert.equal(chooseYourCar.choosingType('Sedan', 'blue',2009), result);

    });
    //•	brandName (brands, brandIndex)
    it('You must remove an element (brand) from the array on the index specified as a parameter.', () => {
        assert.equal(chooseYourCar.brandName(['BMW', 'AUDI', 'VOLVO'], 1), 'BMW, VOLVO');
    }); 
    it('If submitted invalid parameters, throw an error "Invalid Information!"', () => {
        assert.throw(() => {chooseYourCar.brandName(['BMW', 'AUDI'], '3')}, Error, 'Invalid Information!');
        assert.throw(() => {chooseYourCar.brandName('BMW', 1)}, Error, 'Invalid Information!');
        assert.throw(() => {chooseYourCar.brandName(['BMW', 'AUDI'], 5)}, Error, 'Invalid Information!');
    });
    //•	CarFuelConsumption (distanceInKilometers, consumptedFuelInLitres)
    it('If the liters/100km is less or equal to 7L. return "The car is efficient enough, it burns ${litersPerHundredKm} liters/100 km."', () => {
        let result = `The car is efficient enough, it burns ${6.50.toFixed(2)} liters/100 km.`;
        assert.equal(chooseYourCar.carFuelConsumption(100, 6.5), result);
        result = `The car is efficient enough, it burns ${7.0.toFixed(2)} liters/100 km.`;
        assert.equal(chooseYourCar.carFuelConsumption(100, 7), result);
        //if consumption > 7
        result = `The car burns too much fuel - ${8.00.toFixed(2)} liters!`;
        assert.equal(chooseYourCar.carFuelConsumption(100, 8), result);
    });
    it('If params are not a numbers, or are a negative numbers, throw an error: "Invalid Information!"', () => {
        assert.throw(() => {chooseYourCar.carFuelConsumption(-1, 5)}, Error, 'Invalid Information!');
        assert.throw(() => {chooseYourCar.carFuelConsumption(1, -5)}, Error, 'Invalid Information!');
        assert.throw(() => {chooseYourCar.carFuelConsumption(1 , 'AUDI')}, Error, 'Invalid Information!');
        assert.throw(() => {chooseYourCar.carFuelConsumption('BMW' , 1)}, Error, 'Invalid Information!');
        assert.throw(() => {chooseYourCar.carFuelConsumption(-1 , -1)}, Error, 'Invalid Information!');
    });
});