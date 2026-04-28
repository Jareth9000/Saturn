public class AssignmentNames {
    private String name;
    private static int currID = 1;
    private int ID;

    public AssignmentNames(String name) {
        this.name = name;
        ID = currID ++;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "INSERT INTO AssignmentNames (AssignmentName) VALUES ('" + name + "');";
    }
}
