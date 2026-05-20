public class Department {
    private final String name;
    private static int currID;
    private final int departmentID;

    public Department(String name) {
        this.name = name;
        departmentID = currID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Departments (DepartmentName, departmentID) VALUES ('" + name + "', " + departmentID + ");";
    }
}