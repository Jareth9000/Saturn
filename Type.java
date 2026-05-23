public class Type {
    private final String name;
    private final int ID;
    private static int TypeID = 0;

    public Type (String name) {
        this.name = name;
        ID = TypeID++;
    }

    public static void reset() {
        TypeID = 0;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Types (TypeName, TypeID) VALUES ('" + name + "'," + ID + ");";
    }
}