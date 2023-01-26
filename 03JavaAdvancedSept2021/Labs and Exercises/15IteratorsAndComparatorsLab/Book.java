package day17.IteratorsAndComparatorsLab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Book implements Comparable<Book> {
    private  String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors();
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.stream(authors).collect(Collectors.toList());
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Book other) {
        int compared = this.title.compareTo(other.title);
        if (compared == 0) {
            compared = Integer.compare(this.year, other.year);
        }
        return compared;
    }

}
