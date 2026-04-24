public class Rooms {
    private String name;
    private static int ID;

    public Rooms(String name) {
        this.name = name;
        ID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Rooms VALUES ('" + name + "');";
    }
}
