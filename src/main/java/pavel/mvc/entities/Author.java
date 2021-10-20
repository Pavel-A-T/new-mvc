package pavel.mvc.entities;

public class Author {
    private int id;
    private String author;

    public Author() {}

    public Author(String author) {
        this.id = Id.getId();
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

}