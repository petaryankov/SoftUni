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
                const body = res.body;
                expect(res.statusCode, "Status code").to.be.equal(201)
                expect(body.id, "BookId Property").to.be.equal(book.id)
                expect(body.title, "BookTitle Property").to.be.equal(book.title)
                expect(body.author, "BookAuthor Property").to.be.equal(book.author)
                console.log("response: ", body);
                done();
            })
    });

    it('should be able to get all books', (done) => {

        chai.request(server)
            .get('/books')
            .end((err, res) => {
                if (err) {
                    return done(err);
                }
                const body = res.body[0];
                expect(res.statusCode, "Status code").to.be.equal(200)
                expect(body.id, "BookId Property").to.be.equal("1")
                expect(body.title, "BookTitle Property").to.be.equal("My title")
                expect(body.author, "BookAuthor Property").to.be.equal("Petar Yankov")
                console.log("response: ", body);
                done();
            })
    })
})