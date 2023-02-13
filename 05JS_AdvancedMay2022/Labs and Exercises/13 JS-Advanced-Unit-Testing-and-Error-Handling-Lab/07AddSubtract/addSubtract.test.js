const { assert, expect } = require('chai');
const createCalculator = require('./addSubtract');

describe('Test addSubtract functionallity', () => {
    let instance;
    beforeEach(() => {
        instance = createCalculator();
    });
    //Return a module (object), containing the functions add(), subtract() and get() as properties
    it('containing property add, subtract, get', () => {
        //expect(createCalculator()).to.has.ownProperty('add');
        assert.property(instance, 'add');
        assert.property(instance, 'subtract');
        assert.property(instance, 'get');
    })
    //Keep an internal sum that can’t be modified from the outside
    it('add works with single number', () => {
        instance.add(1);
        assert.equal(instance.get(), 1);
    })
    it('add works with multiple nubers', () => {
        instance.add(1);
        instance.add(2);
        assert.equal(instance.get(), 3);
    })
    it('add works with float number', () => {
        instance.add('1.6');
        assert.equal(instance.get(), 1.6);
    })
    it('add works with strings to numbers', () => {
        instance.add('1');
        assert.equal(instance.get(), 1);
    })
    it('subtract works with single nuber', () => {
        instance.subtract(2);
        assert.equal(instance.get(), -2);
    })
    it('subtract works with string to nuber', () => {
        instance.subtract('2');
        assert.equal(instance.get(), -2);
    })
    it('subtract works with multiple nubers', () => {
        instance.subtract(1);
        instance.subtract(2);
        assert.equal(instance.get(), -3);
    })
    it('works with add and subtract', () => {
        instance.add(10);
        instance.add(8);
        instance.subtract(6);
        instance.subtract(2);
        assert.equal(instance.get(), 10);
    })
    it('start value of intance = 0', () => {
        assert.equal(instance.get(), 0);
    })
    it('should return NaN if param is string', () => {
        instance.add('Java')
        //expect(instance.get()).to.be.NaN;
        assert.isNaN(instance.get());
    })
});