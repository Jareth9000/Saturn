public class Rooms {
    private String name;
    private int ID;
    private static int currID = 1;

    public Rooms(String name) {
        this.name = name;
        ID = currID++;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Rooms (RoomName) VALUES ('" + name + "');";
    }
}