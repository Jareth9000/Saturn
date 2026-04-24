public class Type {
    private String name;
    private static int TypeID = 0;

    public Type (String name) {
        this.name = name;
        TypeID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Types (TypeName, TypeID) VALUES ('" + name + "'," + TypeID + ");";
    }
}
