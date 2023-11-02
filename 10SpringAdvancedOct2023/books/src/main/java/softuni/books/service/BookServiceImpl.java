package softuni.books.service;

import org.springframework.stereotype.Service;
import softuni.books.model.dto.AuthorDTO;
import softuni.books.model.dto.BookDTO;
import softuni.books.model.entity.Author;
import softuni.books.model.entity.Book;
import softuni.books.repository.AuthorRepository;
import softuni.books.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    private final AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository
                .findAll()
                .stream()
                .map(BookServiceImpl::mapBookToDTO)
                .toList();
    }

    @Override
    public Optional<BookDTO> findBookById(Long id) {
        return bookRepository
                .findById(id)
                .map(BookServiceImpl::mapBookToDTO);
    }

    @Override
    public void deleteBookById(Long id) {
        this.bookRepository.deleteById(id);
    }

    @Override
    public Long createBook(BookDTO bookDTO) {
        Author author = authorRepository
                .findByName(bookDTO.getAuthor().getName())
                .orElse(null);
        if (author == null) {
            author = new Author();
            author.setName(bookDTO.getAuthor().getName());
            authorRepository.save(author);
        }
        Book book = new Book();
        book.setAuthor(author);
        book.setIsbn(bookDTO.getIsbn());
        book.setTitle(bookDTO.getTitle());

        bookRepository.save(book);

        return book.getId();
    }

    private static BookDTO mapBookToDTO(Book book) {
        BookDTO bookDTO = new BookDTO();
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setName(book.getAuthor().getName());

        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setIsbn(book.getIsbn());
        bookDTO.setAuthor(authorDTO);

        return bookDTO;
    }
}
