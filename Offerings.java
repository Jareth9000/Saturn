public class Offerings {
    private static int currID = 1;
    private int ID;
    private int period;
    private int courseID;
    private int teacherID;
    private int roomID;

    public Offerings(int period, int courseID, int teacherID, int roomID) {
        this.period = period;
        this.courseID = courseID;
        this.teacherID = teacherID;
        this.roomID = roomID;
        ID = currID++;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Offerings (CourseID, TeacherID, RoomID, Period) VALUES (" + courseID + ", " + teacherID + ", " + roomID + ", " + period + ");";
    }
}