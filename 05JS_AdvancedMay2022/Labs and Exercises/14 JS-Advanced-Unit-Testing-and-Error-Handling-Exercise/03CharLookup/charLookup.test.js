const { assert } = require('chai');
const lookupChar = require('./charLookup');

describe('CharLookup', () => {
    it('returns undefined if the first param is not a string ', () => {
        assert.equal(lookupChar(10, 1), undefined);
    });
    it('returns undefined if  the second param is not a number ', () => {
        assert.equal(lookupChar('Java', 'Hi'), undefined);
    });
    it('returns undefined if  the second param is float ', () => {
        assert.equal(lookupChar('Java', 1.2), undefined);
    });
    it('returns Incorrect index if the index is negative number', () => {
        assert.equal(lookupChar('Java', -1), 'Incorrect index');
    });
    it('returns Incorrect index if the index is out of bound', () => {
        assert.equal(lookupChar('Java', 4), 'Incorrect index');
    });
    it('returns correct char index ', () => {
        assert.equal(lookupChar('Java', 1), 'a');
    });
    it('returns correct char index if the input is char ', () => {
        assert.equal(lookupChar('J', 0), 'J');
    });
});