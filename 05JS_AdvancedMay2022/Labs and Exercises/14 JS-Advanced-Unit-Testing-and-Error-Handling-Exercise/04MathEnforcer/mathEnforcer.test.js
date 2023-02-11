const { assert } = require('chai');
const mathEnforcer = require('./mathEnforcer');

describe('MathEnforcer', () => {
    //addFive(num)
    it('returns undefined if the param is not a number', () => {
        assert.equal(mathEnforcer.addFive('Java'), undefined)
    });
    it('works with positive numbers', () => {
        assert.equal(mathEnforcer.addFive(5), 10)
    });
    it('works with negative numbers', () => {
        assert.equal(mathEnforcer.addFive(-5), 0)
    });
    it('works with float numbers', () => {
        assert.equal(mathEnforcer.addFive(5.5), 10.5)
    });
    //subtractTen(num)
    it('returns undefined if the param is not a number', () => {
        assert.equal(mathEnforcer.subtractTen('Java'), undefined)
    });
    it('works with positive numbers', () => {
        assert.equal(mathEnforcer.subtractTen(20), 10)
    });
    it('works with negative numbers', () => {
        assert.equal(mathEnforcer.subtractTen(-10), -20)
    });
    it('works with float numbers', () => {
        assert.equal(mathEnforcer.subtractTen(20.5), 10.5)
    });
    //sum(num1, num2)
    it('returns undefined if the first param is not a number', () => {
        assert.equal(mathEnforcer.sum('Java', 5), undefined)
    });
    it('returns undefined if the second param is not a number', () => {
        assert.equal(mathEnforcer.sum(5, 'Java'), undefined)
    });
    it('works with positive numbers', () => {
        assert.equal(mathEnforcer.sum(5, 6), 11)
    });
    it('works with negative numbers', () => {
        assert.equal(mathEnforcer.sum(-5, -6), -11)
    });
    it('works with float numbers', () => {
        assert.equal(mathEnforcer.sum(5.5, 4.5), 10)
    });
});
