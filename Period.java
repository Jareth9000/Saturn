import java.util.ArrayList;

public class Period {
    private ArrayList<Rooms> roomsTaken;
    private ArrayList<Teachers> teachersTaken;
    private ArrayList<Students> studentsTaken;
    private ArrayList<Offerings> classes;

    public Period() {}

    public boolean addRoom(Rooms newRoom) {
        if (!roomsTaken.contains(newRoom)) {
            roomsTaken.add(newRoom);
            return true;
        }
        return false;
    }

    public boolean addTeacher(Teachers newTeacher) {
        if (!teachersTaken.contains(newTeacher)) {
            teachersTaken.add(newTeacher);
            return true;
        }
        return false;
    }

    public boolean addStudents(Students newStudents) {
        if (!studentsTaken.contains(newStudents)) {
            studentsTaken.add(newStudents);
            return true;
        }
        return false;    }

    public boolean addClass(Offerings newClasses) {
        if (!classes.contains(newClasses)) {
            classes.add(newClasses);
            return true;
        }
        return false;
    }


    public ArrayList<Rooms> getRoomsTaken() {
        return roomsTaken;
    }

    public ArrayList<Teachers> getTeachersTaken() {
        return teachersTaken;
    }

    public ArrayList<Students> getStudentsTaken() {
        return studentsTaken;
    }

    public ArrayList<Offerings> getClasses() {
        return classes;
    }
}
