package pavel.mvc.entities;

public class Genre {
    private int id;
    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String genre;

    public String getGenre() {
        return genre;
    }

    public Genre() {}

    public Genre(String genre) {
        this.id = Id.getId();
        this.genre = genre;
    }

    public int getId() {
        return id;
    }
}