package pavel.mvc.entities;


public class Id {
    private static int id;

    public static int getId() {
        return ++id;
    }
}