public class Students {
    private final String name;
    private final int studentID;
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