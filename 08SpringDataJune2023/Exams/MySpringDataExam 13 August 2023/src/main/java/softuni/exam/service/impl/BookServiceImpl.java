package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.BookImportDTO;
import softuni.exam.models.entity.Book;
import softuni.exam.repository.BookRepository;
import softuni.exam.service.BookService;
import softuni.exam.util.ValidationUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static softuni.exam.util.Constants.*;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final Gson gson;
    private final ModelMapper modelMapper;
    private final ValidationUtils validationUtils;

    public BookServiceImpl(BookRepository bookRepository, Gson gson, ModelMapper modelMapper, ValidationUtils validationUtils) {
        this.bookRepository = bookRepository;
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtils = validationUtils;
    }

    @Override
    public boolean areImported() {
        return this.bookRepository.count() > 0;
    }

    @Override
    public String readBooksFromFile() throws IOException {
        return Files.readString(Path.of(BOOKS_URL));
    }

    @Override
    public String importBooks() throws IOException {
        StringBuilder sb = new StringBuilder();

        List<BookImportDTO> books = Arrays.stream(this.gson.fromJson(readBooksFromFile(), BookImportDTO[].class))
                .collect(Collectors.toList());

        for (BookImportDTO book : books) {
            sb.append(System.lineSeparator());
            Optional<Book> optionalBook = this.bookRepository.findBookByTitle(book.getTitle());
            if (!this.validationUtils.isValid(book) || optionalBook.isPresent()) {

                sb.append(INVALID_BOOK);
                continue;
            }
            Book bookToSAve = this.modelMapper.map(book, Book.class);
            Book savedBook = this.bookRepository.save(bookToSAve);
            sb.append(String.format(SUCCESSFUL_BOOKS,
                    savedBook.getAuthor(),
                    savedBook.getTitle()));
        }

        return sb.toString().trim();
    }
}
