package pavel.mvc;

public class Genre {
    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String genre;

    public String getGenre() {
        return genre;
    }

    public Genre() {}

    public Genre(String genre) {
        this.genre = genre;
    }
}