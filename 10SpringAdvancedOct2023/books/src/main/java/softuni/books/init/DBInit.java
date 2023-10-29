package softuni.books.init;

import softuni.books.model.entity.Author;
import softuni.books.model.entity.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import softuni.books.repository.AuthorRepository;
import softuni.books.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class DBInit implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public DBInit(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) {

        if (bookRepository.count() > 0 && authorRepository.count() > 0) {
            initJovkov();
            initNikolaiHaitov();
            initDimitarTalev();
            initElinPelin();
            initVazov();
        }

    }

    private void initVazov() {
        initAuthor("Иван Вазов",
                "Пряпорец и Гусла",
                "Под Игото",
                "Тъгите на България");
    }

    private void initElinPelin() {
        initAuthor("Елин Пелин", "Пижо и Пенда",
                "Яб Бибиян на луната",
                "Под манастирската лоза");
    }

    private void initDimitarTalev() {
        initAuthor("Димитър Димов", "Тютюн");
    }


    private void initJovkov() {
        initAuthor("Йордан Йовков",
                "Старопланински легенди", "Чифликът ");
    }


    private void initNikolaiHaitov() {
        initAuthor("Николай Хайтов", "Диви Разкази");
    }

    private void initAuthor(String authorName, String... booksTitle) {
        Author author = new Author();
        author.setName(authorName);
        author = authorRepository.save(author);

        List<Book> allBooks = new ArrayList<>();

        for (String bookTitle : booksTitle) {
            Book book = new Book();
            book.setAuthor(author);
            book.setTitle(bookTitle);
            book.setIsbn(UUID.randomUUID().toString()); //random string, not real
            allBooks.add(book);
        }
        author.setBooks(allBooks);
        authorRepository.save(author);

        bookRepository.saveAll(allBooks);
    }

}
