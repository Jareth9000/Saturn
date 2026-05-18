public class Students {
    private String name;
    private static int ID;
    private int studentID;

    public Students(String name) {
        this.name = name;
        studentID = ID++;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Students (StudentName) VALUES ('" + name + "');";
    }
}
