public class Offerings {
    private static int currID = 1;
    private final int ID;
    private final int period;
    private final int courseID;
    private final int teacherID;
    private final int roomID;

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
        return "INSERT INTO Offerings (CourseID, TeacherID, RoomID, Period) VALUES ('" + courseID + "', '" + teacherID + "', '" + roomID + "', '" + period + "');";
    }
}