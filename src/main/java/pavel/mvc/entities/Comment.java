package pavel.mvc.entities;

public class Comment {
    private int id;
    private String description;

    public Comment(String description) {
        this.id = Id.getId();
        this.description = description;
    }

    public Comment() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }
}