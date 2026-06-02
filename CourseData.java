import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseData {
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
}
~
