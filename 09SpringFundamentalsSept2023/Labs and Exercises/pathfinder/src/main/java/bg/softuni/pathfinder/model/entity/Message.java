package bg.softuni.pathfinder.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Messages")
public class Message extends BaseEntity {
    //•	date time - Accepts Date and Time values
    //•	text content - Accepts very long String values
    //•	author - Accepts User Entities as values
    //•	recipient - Accepts User Entities as values
    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;
    @Column(name = "text_content")
    private String textContent;
    @ManyToOne
    @JoinColumn
    private User author;
    @ManyToOne
    @JoinColumn
    private User recipient;

    public Message() {
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
}
