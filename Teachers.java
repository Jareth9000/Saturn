public class Teachers {
    private String name;
    private int departmentID;
    private static int teacherID = 0;

    public Teachers(String name, int departmentID) {
        this.name = name;
        this.departmentID = departmentID;
        teacherID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Teachers (TeacherName, TeacherID, DepartmentID) VALUES ('" + name + "'," + teacherID +" ," + departmentID + ");";
    }
}