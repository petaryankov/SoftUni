const { assert } = require("chai");
const { isOddOrEven } = require('./evenOrOdd');

describe('IsOddOrEven', () => {
    // invalid input
    it('returns undefined if the input is a number', () => {
        assert.equal(isOddOrEven(1), undefined);
    });
    it('returns undefined if the input is an object', () => {
        assert.equal(isOddOrEven({}), undefined);
    });
    it('returns undefined if the input is an array', () => {
        assert.equal(isOddOrEven([]), undefined);
    });
    it('returns undefined if the input is undefinet', () => {
        assert.equal(isOddOrEven({}), undefined);
    });
    // valid input
    it('returns even if the input JS', () => {
        assert.equal(isOddOrEven('JS'), 'even');
    });
    it('returns odd if the input Hello', () => {
        assert.equal(isOddOrEven('Hello'), 'odd');
    });
});
