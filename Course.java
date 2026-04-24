public class Course {
    private String name;
    private int TypeID;
    private static int CourseID = 0;


    public Course (String name) {
        this.name = name;
        CourseID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Courses (CourseName,CourseID,TypeID) VALUES ('" + name + "'," + CourseID + "'," + TypeID + ");";
    }


}
