const { expect } = require('chai');
const { isSymmetric } = require('./checkForSymmetry');

describe('Simmetry checker', () => {
    
    it('works with symmetric nummeric array', () => {
        expect(isSymmetric([1, 2, 2, 1])).to.be.true;
    });
    it('returns false for non-symmetric numeric array', () => {
        expect(isSymmetric([1, 2, 1, 1])).to.be.false;
    });
    it('returns false for non-array', () => {
        expect(isSymmetric(1)).to.be.false;
    });
    it('works with symmetric odd legth', () => {
        expect(isSymmetric([1, 2, 1])).to.be.true;
    });
    it('return false with type different symetric array', () => {
        expect(isSymmetric([1, 2, '1'])).to.be.false;
    });
    it('works with symmetric string array', () => {
        expect(isSymmetric(['a', 'b', 'b', 'a'])).to.be.true;
    });
    it('return false for mismatched elements', () => {
        expect(isSymmetric(['a', 'b', 1, 'a'])).to.be.false;
    });
});