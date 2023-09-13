package softuni.exam.models.dto;

import softuni.exam.models.entity.Book;
import softuni.exam.models.entity.LibraryMember;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "borrowing_record")
@XmlAccessorType(XmlAccessType.FIELD)
public class BorrowingRecordsImportDTO {
    //•	borrow date - a date in the "yyyy-MM-dd" format.
    //•	return date - a date in the "yyyy-MM-dd" format.
    //•	remarks - can be used to store any relevant information and might be helpful for tracking and managing the borrowing records.
    // Accepts char sequence (between 3 to 100 inclusive). Can be nullable.
    //•	Constraint: The borrowing_records table has a relation with books table.
    //•	Constraint: The borrowing_records table has a relation with library_members table.

    @NotNull
    @XmlElement(name = "borrow_date")
    private String borrowDate;
    @NotNull
    @XmlElement(name = "return_date")
    private String returnDate;
    @XmlElement
    @Size(min = 3, max = 100)
    private String remarks;
    @XmlElement
    @NotNull
    private Book book;
    @XmlElement
    @NotNull
    private LibraryMember member;

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
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
}
