public class AssignmentNames {
    private final String name;
    private final int ID;
    private static int currID = 1;


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