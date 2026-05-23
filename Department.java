public class Department {
    private final String name;
    private static int currID = 1;
    private int ID;

    public Department(String name) {
        this.name = name;
        ID = currID++;
    }

    public static void reset() {
        currID = 0;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Departments (DepartmentName, departmentID) VALUES ('" + name + "'," + ID + ");";
    }
}
