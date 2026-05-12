public class Teachers {
    private final String name;
    private final int departmentID;
    private final int teacherID;
    private static int currID = 1;

    public Teachers(String name, int departmentID) {
        this.name = name;
        this.departmentID = departmentID;
        teacherID = currID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Teachers (TeacherName, TeacherID, DepartmentID) VALUES ('" + name + "', " + teacherID +", " + departmentID + ");";
    }
}