import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main() throws FileNotFoundException {
        ArrayList<Department> departments = SaturnDataMaker.departmentData();
        Department.reset();
        for(Department department : departments)
        {
            System.out.println(department);
        }
        ArrayList<Rooms> rooms = SaturnDataMaker.makeRooms();
        Rooms.reset();
        for (Rooms room : rooms) {
            System.out.println(room);
        }
        ArrayList<Type> types = SaturnDataMaker.makeTypes();
        Type.reset();
        for (Type type : types) {
            System.out.println(type);
        }
        ArrayList<Teachers> teachers = SaturnDataMaker.teacherData();
        Teachers.reset();
        Department.reset();
        for (Teachers teacher : teachers) {
            System.out.println(teacher);
        }
        ArrayList<Course> courses = SaturnDataMaker.makeCourses();
        Course.reset();
        for (Course course : courses) {
            System.out.println(course);
        }
        ArrayList<Students> students = SaturnDataMaker.studentData();
        Students.reset();
        for (Students student : students) {
            System.out.println(student);
        }
        ArrayList<Offerings> offerings = SaturnDataMaker.offeringsData();
        Offerings.reset();
        Teachers.reset();
        Course.reset();
        Rooms.reset();
        for (Offerings offering : offerings) {
            System.out.println(offering);
        }
       ArrayList<AssignmentNames> assignmentNames = SaturnDataMaker.makeAssignmentNames();
       AssignmentNames.reset();
       for (AssignmentNames assignmentName : assignmentNames) {
           System.out.println(assignmentName);
       }
       ArrayList<Roster> rosters = SaturnDataMaker.RosterData(offerings,students);
       for (Roster roster : rosters) {
           System.out.println(roster);
       }
       ArrayList<Assignment> assignments = SaturnDataMaker.makeAssignments(rosters);
       for (Assignment assignment : assignments) {
           System.out.println(assignment);
       }
    }
}
