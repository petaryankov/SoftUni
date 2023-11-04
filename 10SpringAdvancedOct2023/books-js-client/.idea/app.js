let loadBooksButton = document.getElementById('loadBooks');

loadBooksButton.addEventListener('click', loadBooks);

function loadBooks() {

    let booksContainer = document.getElementById('books-container')

    fetch('http://localhost:8080/api/books')
        .then(response => response.json())
        .then(json => json.forEach(book => {
            console.log(book);
        }));
}