public class Course {
    private String name;
    private int TypeID;
    private int ID;
    private static int CourseID = 1;


    public Course (String name, int type) {
        this.name = name;
        TypeID = type;
        ID = CourseID++;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Courses (CourseName,TypeID) VALUES ('" + name + "', " + TypeID + ");";
    }


}
