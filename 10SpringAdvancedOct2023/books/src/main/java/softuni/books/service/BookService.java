package softuni.books.service;

import softuni.books.model.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> getAllBooks();
}
