package pavel.mvc;

public class Comment {
    private String description;

    public Comment(String description) {
        this.description = description;
    }

    public Comment() { }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}