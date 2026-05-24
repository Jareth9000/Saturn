public class Students {
    private String name;
    private static int ID = 1;
    private int studentID;

    public Students(String name) {
        this.name = name;
        studentID = ID++;
    }

    public static void reset() {
        ID = 1;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Students (StudentName) VALUES ('" + name + "');";
    }
}
