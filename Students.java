public class Students {
    private String name;
    private int studentID;
    private static int currID;

    public Students(String name) {
        this.name = name;
        studentID = currID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Students (StudentName) VALUES ('" + name + "');";
    }
}