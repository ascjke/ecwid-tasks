package ru.borisov.deepclone;

import java.util.*;

public class Library {
    private String name;
    private String address;
    private List<Book> books = new ArrayList<>();
    private Set<Reader> subscribers = new HashSet<>();

    public Library() {
    }

    public Library(String name, String address, List<Book> books, Set<Reader> subscribers) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.subscribers = subscribers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Set<Reader> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Set<Reader> subscribers) {
        this.subscribers = subscribers;
    }

    public boolean addSubscriber(Reader reader) {
        return subscribers.add(reader);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(address, library.address) && Objects.equals(books, library.books) && Objects.equals(subscribers, library.subscribers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, books, subscribers);
    }

    @Override
    public String toString() {
        return "Library{" +
                "\nname='" + name + '\'' +
                "\naddress='" + address + '\'' +
                "\nbooks=" + books +
                "\nsubscribers=" + subscribers +
                '}';
    }
}
