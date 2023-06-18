const { assert, expect } = require('chai');
const motorcycleRider = require('./chooseYourCar');

describe('MotorcycleRider test', () => {
    //•	licenseRestriction (category) 
    it('AM return result', () => {
        let result = 'Mopeds with a maximum design speed of 45 km. per hour, engine volume is no more than 50 cubic centimeters, and the minimum age is 16.';
        assert.equal(motorcycleRider.licenseRestriction('AM'), result);
    });
    it('A1 return result', () => {
        let result = 'Motorcycles with engine volume is no more than 125 cubic centimeters, maximum power of 11KW. and the minimum age is 16.';
        assert.equal(motorcycleRider.licenseRestriction('A1'), result);
    });
    it('A2 return result', () => {
        let result = 'Motorcycles with maximum power of 35KW. and the minimum age is 18.';
        assert.equal(motorcycleRider.licenseRestriction('A2'), result);
    });
    it('A return result', () => {
        let result = 'No motorcycle restrictions, and the minimum age is 24.';
        assert.equal(motorcycleRider.licenseRestriction('A'), result);
    });
    it('!AM,A1,A2,A return Error', () => {
        assert.throws(() => { motorcycleRider.licenseRestriction('KK') }
        , Error, 'Invalid Information!');
    });


    //•	motorcycleShowroom (engineVolume, maximumEngineVolume)
    it('correct params return result', () => {
        let result = `There are ${2} available motorcycles matching your criteria!`;
        assert.equal(motorcycleRider.motorcycleShowroom(['55', '60'], 100), result);
    });
    it('negative maximumEngineVolume throws error', () => {
        assert.throws(() => { 
            motorcycleRider.motorcycleShowroom(['10', '200'], -250) }
        , Error, 'Invalid Information!');
    });
    it('empty array throws error', () => {
        assert.throws(() =>  {
            motorcycleRider.motorcycleShowroom([], 40)}, Error, 'Invalid Information!');
    });
    //•	otherSpendings (equipment, consumables, discount)
    it('wrong param throws error', () => {
        assert.throws(() =>  {
            motorcycleRider.otherSpendings('200', [300], true)}, Error, 'Invalid Information!');
    });
    it('correct params with discount return result', () => {
        let result = `You spend $${540.00.toFixed(2)} for equipment and consumables with 10% discount!`;
        assert.equal(motorcycleRider.otherSpendings(['helmet', 'jacked'], ['engine oil','oil filter'], true), result);
    });
    it('correct params with no discount return result', () => {
        let result = `You spend $${300.00.toFixed(2)} for equipment and consumables!`;
        assert.equal(motorcycleRider.otherSpendings(['helmet', 'jacket'], ['engine oil', 'oil filter'], false), result);
    });
});