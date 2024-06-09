const chai = require('chai');
const chaiHttp = require('chai-http');
const server = require('./server');
const { log } = require('console');
const { domainToUnicode } = require('url');

const expect = chai.expect;

chai.use(chaiHttp);

describe('Books', () => {
    it('should be able to create new book', (done) => {
        const book = { id: "1", title: "My title", author: "Petar Yankov" }
        chai.request(server)
            .post('/books')
            .send(book)
            .end((err, res) => {
                if (err) {
                    return done(err);
                }
                expect(res.statusCode, "Status code").to.be.equal(201)
                console.log("response: ", res.body);
                done();
            })
    })
})