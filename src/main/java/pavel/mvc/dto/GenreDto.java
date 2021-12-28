package pavel.mvc.dto;


public class GenreDto {
    private int id;
    private String genre;

    public GenreDto(int id, String genre) {
        this.id = id;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "GenreDto{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                '}';
    }
}