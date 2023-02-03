package ru.borisov.deepclone;


import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Book book_1 = new Book("In Search of Lost Time", "Marcel Proust", 1100);
        Book book_2 = new Book("Ulysses", "James Joyce", 5800);
        Book book_3 = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 12000);
        Book book_4 = new Book("Lolita", "Vladimir Nabokov", 3200);
        Book book_5 = new Book("The Catcher in the Rye", "J. D. Salinger", 16000);
        Book book_6 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 50000);

        Reader zakhar = new Reader("Zakhar", 32, Set.of(book_1, book_2, book_3, book_4));
        Reader nadya = new Reader("Nadya", 26, Set.of(book_4, book_5, book_6));

        book_1.addReader(zakhar);
        book_2.addReader(zakhar);
        book_3.addReader(zakhar);
        book_4.addReader(zakhar);
        book_4.addReader(nadya);
        book_5.addReader(nadya);
        book_6.addReader(nadya);

        Library library = new Library("MSU library",
                "Moscow",
                List.of(book_1, book_2, book_3, book_4, book_5, book_6),
                Set.of(zakhar, nadya));

        Library libraryCopy = CopyUtils.deepCopy(library);

        System.out.println("library: " + library);
        System.out.println("***************************************************");
        System.out.println("libraryCopy: " + libraryCopy);
        System.out.println("***************************************************");
        System.out.println("library equals libraryCopy ? " + library.equals(libraryCopy));
    }
}
