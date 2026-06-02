import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherData{
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
}