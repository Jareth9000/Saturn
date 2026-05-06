public class Type {
    private String name;
    private int ID;
    private static int TypeID = 0;

    public Type (String name) {
        this.name = name;
        ID = TypeID++;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Types (TypeName, TypeID) VALUES ('" + name + "'," + ID + ");";
    }
}
