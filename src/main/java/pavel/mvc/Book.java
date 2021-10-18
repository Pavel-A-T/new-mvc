package pavel.mvc;

public class Book {
    private String name;
    private Author author;
    private Genre genre;
    private Comment comment;

    public Book() {
    }

    public Book(String name, Author author, Genre genre, Comment comment) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.comment = comment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public Comment getComment() {
        return comment;
    }
}