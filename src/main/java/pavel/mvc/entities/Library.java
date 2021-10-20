package pavel.mvc.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private static final List<Genre> genres = new ArrayList<>();
    private static final List<Book> books = new ArrayList<>();

    static {
        genres.add(new Genre("Detective"));
        genres.add(new Genre("Magazine"));
        genres.add(new Genre("Proze"));
        genres.add(new Genre("fairy tale"));
        books.add(new Book("The Tale of Tsar Saltan", new Author("Pushkin"), getGenre("fairy tale"), new Comment("no comment")));
        books.add(new Book("Children of Arbat", new Author("Rybakov"), getGenre("Proze"), new Comment("no comment")));
        books.add(new Book("Stories", new Author("Prishvin"), getGenre("Proze"), new Comment("not interesting")));
        books.add(new Book("Sherlock Holmes", new Author("Conan Doyle"), getGenre("Detective"), new Comment("interesting")));
    }

    public static Genre getGenre(String genre) {
        if (genres.stream().noneMatch(e -> e.getGenre().equals(genre))) {
            return new Genre(genre);
        }
        else {
            return genres.stream().filter(e -> e.getGenre().equals(genre)).findFirst().get();
        }
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static boolean addGenre(Genre genre) {
        if (genres.stream().allMatch(item -> !item.getGenre().equals(genre.getGenre()))) {
            return genres.add(genre);
        }
        return false;
    }

    public static Book addBook(Book book) {
        if (book.getId() == 0) {
            book.setId();
       }
        books.add(book);
        return book;
    }

    public static Optional<Book> getBookById(int id) {
        return books.stream().filter(e -> e.getId() == id).findFirst();
    }


}