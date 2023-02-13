const { expect, assert, AssertionError } = require("chai");
const { sum } = require('./sumOfNumbers');

describe('SumOfNumbers', () => {
    it('returning correct sum', () => {
        assert.equal(sum([5, 4, 1]), 10);
    });

    it('working with string numbers', () => {
        //expect(sum(['5', 4])).to.equal(9);
        assert.equal(sum(['4', '5']), 9);
    });

    it('working with float numbers', () => {
        //expect(sum(['5.5', 4.5])).to.equal(10);
        assert.equal(sum([4.5, 5.5]), 10);
    });
    it('working with negative numbers', () => {
        //expect(sum(['5.5', 4.5])).to.equal(10);
        assert.equal(sum([-5, -5]), -10);
    });
});