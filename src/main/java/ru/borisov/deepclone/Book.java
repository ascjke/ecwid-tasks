package ru.borisov.deepclone;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Book {
    private String author;
    private String year;
    private int amount;
    private Set<Reader> readers = new HashSet<>();

    public Book() {
    }

    public Book(String author, String year, int amount) {
        this.author = author;
        this.year = year;
        this.amount = amount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    public boolean addReader(Reader reader) {
        return readers.add(reader);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return amount == book.amount && Objects.equals(author, book.author) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, year, amount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", amount=" + amount +
                '}';
    }
}
