public class Department {
    private String name;
    private static int ID = 0;

    public Department(String name) {
        this.name = name;
        ID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Departments (DepartmentName, departmentID) VALUES ('" + name + "'," + ID + ");";
    }
}