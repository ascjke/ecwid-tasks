package ru.borisov.deepclone;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Reader {
    private String name;
    private int age;
    private Set<Book> favoriteBooks = new HashSet<>();

    public Reader() {
    }

    public Reader(String name, int age, Set<Book> favoriteBooks) {
        this.name = name;
        this.age = age;
        this.favoriteBooks = favoriteBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    public void setFavoriteBooks(Set<Book> favoriteBooks) {
        this.favoriteBooks = favoriteBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return age == reader.age && Objects.equals(name, reader.name) && Objects.equals(favoriteBooks, reader.favoriteBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, favoriteBooks);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favoriteBooks=" + favoriteBooks +
                '}';
    }
}
