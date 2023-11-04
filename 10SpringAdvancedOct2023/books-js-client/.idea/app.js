let loadBooksButton = document.getElementById('loadBooks');

loadBooksButton.addEventListener('click', loadBooks);

function loadBooks() {

    let booksContainer = document.getElementById('books-container');
    booksContainer.innerHTML = '';

    fetch('http://localhost:8080/api/books')
        .then(response => response.json())
        .then(json => json.forEach(book => {
            console.log(book);

            let bookRow = document.createElement('tr');

            let titleCol = document.createElement('td');
            let authorCol = document.createElement('td');
            let isbnCol = document.createElement('td');
            let actionCol = document.createElement('td');

            titleCol.textContent = book.title;
            authorCol.textContent = book.author.name;
            isbnCol.textContent = book.isbn;

            let deleteBookBtn = document.createElement('button');
            deleteBookBtn.textContent = 'DELETE';
            deleteBookBtn.dataset.id = book.id;

            deleteBookBtn.addEventListener('click', deleteBook);

            actionCol.appendChild(deleteBookBtn);

            bookRow.appendChild(titleCol);
            bookRow.appendChild(authorCol);
            bookRow.appendChild(isbnCol);
            bookRow.appendChild(actionCol);

            booksContainer.append(bookRow);

        }));
}

function deleteBook(e) {
        let bookId = e.target.dataset.id;
        let requestOptions = {
                method: 'DELETE'
        }
    fetch(`http://localhost:8080/api/books/${bookId}`, requestOptions)
        .then(_ => loadBooks())
        .catch(error => console.log('error', error));
}