import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SaturnDataMaker {
    public static ArrayList<Department> departmentData() throws FileNotFoundException {
        ArrayList<Department> departmentData = new ArrayList<>();
        File file = new File("DepartmentFile");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            departmentData.add(new Department(scanner.nextLine()));
        }
        return departmentData;
    }

    public static ArrayList<Type> makeTypes() throws FileNotFoundException {
        ArrayList<Type> types = new ArrayList<>();
        types.add(new Type("Elective"));
        types.add(new Type("Regents course"));
        types.add(new Type("AP course"));
        return types;
    }

    public static ArrayList<Teachers> teacherData() throws FileNotFoundException {
        File file = new File("TeacherFile"); // reads file with all course data from data doc
        Scanner scan;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Teachers> teachers = new ArrayList<>();
        ArrayList<Department> departments = SaturnDataMaker.departmentData();
        int departmentID = 0;

        while (scan.hasNext()) {
            String teacher = scan.nextLine();
            if(teacher.contains("'")){
                int location = teacher.indexOf("'");
                teacher = teacher.substring(0, location) + "'" + teacher.substring(location);
            }
            if (!teacher.contains("\"")) {
                for (Department department:departments) {
                    if (department.getName().equals(teacher)) {
                        departmentID = department.getID();
                    }
                }
            } else {
                teachers.add(new Teachers(teacher.substring(1,teacher.length()-1), departmentID));
            }
        }
        return teachers;
    }
    
    public static ArrayList<Students> studentData() throws FileNotFoundException {
        ArrayList<Students> studentsData = new ArrayList<>();
        File file = new File("StudentFile");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            studentsData.add(new Students(scanner.nextLine()));
        }
        return studentsData;
    }





    public static ArrayList<Rooms> makeRooms() {
        ArrayList<Rooms> Roomsdata = new ArrayList<>();
        String add = "";
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 1; k < 21; k++){
                    add = "";
                    //first
                    if(i == 0){
                        add += "B";
                    }
                    else{
                        add += i;
                    }
                    //second
                    if(j == 0){
                        add += "N";
                    }
                    else if(j == 1){
                        add += "S";
                    }
                    else if(j == 2){
                        add += "E";
                    }
                    else{
                        add += "W";
                    }
                    //third
                    add += k;
                    Roomsdata.add(new Rooms(add));
                }
            }
        }
        return Roomsdata;
    }

    public static ArrayList<Course> makeCourses() {
        File file = new File("data"); // reads file with all course data from data doc
        Scanner scan;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Course> courses = new ArrayList<>();
        int type = 0;
        while (scan.hasNext()) {
            String str = scan.nextLine();
            if(str.contains("'")){
                int location = str.indexOf("'");
                str = str.substring(0, location) + "'" + str.substring(location);
            }
            if (str.equals("AP Courses")) {
                type = 3;
            } else if (str.equals("Regents Courses")) {
                type = 2;
            } else if (str.equals("Elective / Non-AP / Non-Regents Courses")) {
                type = 1;
            }
            Course course = new Course(str, type);
            courses.add(course);
        }
        return courses;
    }

    public static ArrayList<AssignmentNames> makeAssignmentNames() {
        ArrayList<AssignmentNames> assNamesData = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {

            assNamesData.add(new AssignmentNames("Classwork " + i));
            assNamesData.add(new AssignmentNames("Homework " + i));
            if (i % 2 == 0) {
                assNamesData.add(new AssignmentNames("Test " + i / 2));
            }
        }
        System.out.println();
        return assNamesData;
    }

    public static ArrayList<Roster> RosterData(ArrayList<Offerings> offerings, ArrayList<Students> studentList){
        ArrayList<Roster> rosterData = new ArrayList<>();
        for(Students student: studentList){
            for(int i = 1; i <= 10; i++){
                int random = (int)(Math.random() * offerings.size());
                while(offerings.get(random).getPeriod() != i){
                    random = (int)(Math.random() * offerings.size());
                }
                rosterData.add( new Roster(offerings.get(random).getID(), student.getStudentID()));
            }
        }
        return rosterData;
    }

    public static ArrayList<Offerings> offeringsData() throws FileNotFoundException {
        ArrayList<Course> courses = CourseData.makeCourses();
        ArrayList<Teachers> teachers = TeacherData.teacherData();
        ArrayList<Rooms> rooms  = RoomData.makeRooms();
        ArrayList<Offerings> offers = new ArrayList<>();
        Period[] periods = new Period[10];
        for (int i = 1; i < 11; i++) {
            periods[i-1] = new Period(i);
        }
        for (Course course: courses) {
            int numOffers = (int) (Math.random() * 5) + 1;
            for (int i = 0; i < numOffers; i++) {
                int periodNumber = (int) (Math.random() * 10) + 1;
                Teachers teacher = teachers.get((int) (Math.random() * teachers.size()));
                Rooms room = rooms.get((int) (Math.random() * rooms.size()));
                boolean check = false;
                while (!check) {
                    teacher = teachers.get((int) (Math.random() * teachers.size()));
                    check = periods[periodNumber - 1].addTeacher(teacher);
                }
                check = false;
                while (!check) {
                    room = rooms.get((int) (Math.random() * rooms.size()));
                    check = periods[periodNumber - 1].addRoom(room);
                }
                Offerings offer = new Offerings(periodNumber,course.getID(),teacher.getID(),room.getID());
                offers.add(offer);
            }
        }
        return offers;
    }

    public static ArrayList<Assignment> makeAssignments(ArrayList<Roster> rosters) {
        ArrayList<Assignment> assignments = new ArrayList<>();
        ArrayList<AssignmentNames> assignmentNames = AssNameMaker.makeAssignmentNames();
        for (Roster roster : rosters) {
            for (int i = 0; i < 15; i++) {
                int grade = (int) (Math.random() * 26) + 75;
                boolean scale = assignmentNames.get(i).getName().contains("Test");
                Assignment assignment = new Assignment(assignmentNames.get(i).getID(),roster.getStudentID(),roster.getOfferingID(),scale,grade);
                assignments.add(assignment);
            }
        }
        return assignments;
    }
}
