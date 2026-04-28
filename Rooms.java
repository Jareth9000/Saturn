public class Rooms {
    private String name;
    private int ID;
    private static int currID;

    public Rooms(String name) {
        this.name = name;
        ID = currID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Rooms (RoomName) VALUES ('" + name + "');";
    }
}