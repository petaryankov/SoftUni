const { expect } = require("chai");
const { rgbToHexColor } = require('./06RGBToHex');

//Take three integer numbers, representing the red, green, and blue values of RGB color, each within the range [0…255]
//Return the same color in hexadecimal format as a string (e.g. '#FF9EAA')
//Return undefined if any of the input parameters are of an invalid type or not in the expected range
describe('rgbToHexColor', () => {
    it('converts black', () => {
        expect(rgbToHexColor(0, 0, 0)).to.equal('#000000');
    });

    it('converts white', () => {
        expect(rgbToHexColor(255, 255, 255)).to.equal('#FFFFFF');
    });
    it('undefined for missing params', () => {
        expect(rgbToHexColor(0, 0)).to.be.undefined;
        expect(rgbToHexColor(0)).to.be.undefined;
        expect(rgbToHexColor(0)).to.be.undefined;
    });

    it('return undefined out of lower bound', () => {
        expect(rgbToHexColor(-1, 0, 0)).to.be.undefined;
        expect(rgbToHexColor(0, -1, 0)).to.be.undefined;
        expect(rgbToHexColor(0, 0, -1)).to.be.undefined;
    });

    it('return undefined out of upper bound', () => {
        expect(rgbToHexColor(256, 0, 0)).to.be.undefined;
        expect(rgbToHexColor(0, 256, 0)).to.be.undefined;
        expect(rgbToHexColor(0, 0, 256)).to.be.undefined;
    });

    it('return undefined for floats', () => {
        expect(rgbToHexColor(1.1, 0, 0)).to.be.undefined;
        expect(rgbToHexColor(0, 1.1, 0)).to.be.undefined;
        expect(rgbToHexColor(0, 0, 1.1)).to.be.undefined;
    });

    it('return undefined for string', () => {
        expect(rgbToHexColor('1', 0, 0)).to.be.undefined;
        expect(rgbToHexColor(0, '1', 0)).to.be.undefined;
        expect(rgbToHexColor(0, 0, '1')).to.be.undefined;
    });
});