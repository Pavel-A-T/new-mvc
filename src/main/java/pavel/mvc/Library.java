package pavel.mvc;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Genre> genres = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();

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
        Genre g = genres.stream().filter(e -> e.getGenre().equals(genre)).findFirst().orElse(new Genre("other"));
        if (g.getGenre().equals("other")) {
            return null;
        }
        return g;
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

    public static boolean addBook(Book book) {
        if (books.stream().noneMatch(item -> item.getName().equals(book.getName()))) {
            return books.add(book);
        }
        else {
            Book b = books.stream().filter(e -> e.getName().equals(book.getName())).findFirst().get();
            b.setAuthor(book.getAuthor());
            b.setGenre(book.getGenre());
            b.setComment(book.getComment());
            return true;
        }
    }
}