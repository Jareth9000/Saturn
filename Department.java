public class Department {
    private final String name;
    private static int ID = 0;

    public Department(String name) {
        this.name = name;
        ID++;
    }

    public static void reset() {
        ID = 0;
    }

    public String getName() {
        return name;
    }

    public static int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Departments (DepartmentName, departmentID) VALUES ('" + name + "'," + ID + ");";
    }
}