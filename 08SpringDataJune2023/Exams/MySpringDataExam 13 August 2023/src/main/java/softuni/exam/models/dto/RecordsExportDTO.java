package softuni.exam.models.dto;

import softuni.exam.models.entity.Book;
import softuni.exam.models.entity.LibraryMember;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class RecordsExportDTO {
    private Long id;
    private LocalDate borrowDate;

    private LocalDate returnDate;

    private String remarks;

    private Book book;

    private LibraryMember member;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LibraryMember getMember() {
        return member;
    }

    public void setMember(LibraryMember member) {
        this.member = member;
    }

    @Override
    public String toString() {
        String format =
                "Book title: %s\n" +
                "*Book author: %s\n" +
                "**Date borrowed: %s\n" +
                "***Borrowed by: %s %s\n";

        return String.format(format,
                this.book.getTitle(),
                this.book.getAuthor(),
                this.borrowDate,
                this.member.getFirstName(),
                this.member.getLastName());
    }
}
