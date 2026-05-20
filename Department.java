public class Department {
    private String name;
    private int ID;
    private static int DepartmentID = 1;

    public Department(String name) {
        this.name = name;
        ID = DepartmentID++;
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
