import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Print ALL of the Insert Statements
        ArrayList<Rooms> RoomList = SaturnDataMaker.makeRooms();
        for (Rooms room : RoomList) {
            System.out.println(room.toString());
        }
        ArrayList<Department> departmentList = SaturnDataMaker.departmentData();
        for (Department department : departmentList) {
            System.out.println(department);
        }
        ArrayList<Type> typeList = SaturnDataMaker.makeTypes();
        for (Type type : typeList) {
            System.out.println(type);
        }
        ArrayList<Students> studentList = SaturnDataMaker.studentData();
        for (Students students : studentList) {
            System.out.println(students);
        }
        ArrayList<Teachers> teacherList = SaturnDataMaker.teacherData();
        for (Teachers teachers : teacherList) {
            System.out.println(teachers);
        }
        ArrayList<Course> courseList = SaturnDataMaker.makeCourses();
        for (Course course : courseList) {
            System.out.println(course);
        }
        ArrayList<Offerings> offeringList = SaturnDataMaker.offeringsData();
        for (Offerings offerings : offeringList) {
            System.out.println(offerings);
        }
        ArrayList<Roster> rosterList = SaturnDataMaker.RosterData(offeringList,studentList);
        for (Roster roster : rosterList) {
            System.out.println(roster);
        }
        ArrayList<AssignmentNames> assignmentNames = SaturnDataMaker.makeAssignmentNames();
        for (AssignmentNames assignmentNames1: assignmentNames) {
            System.out.println(assignmentNames1);
        }
        ArrayList<Assignment> assignments = SaturnDataMaker.makeAssignments(rosterList);
        for (Assignment assignment : assignments) {
            System.out.println(assignment);
        }
    }
}
