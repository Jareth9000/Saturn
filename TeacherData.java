import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherData{
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        for(Teachers testing : teacherData()){
            System.out.println(testing);
            if(testing.getName().substring(0, 1).equals(" ")){
                count++;
            }
        }
        System.out.println(count);
    }



    public static ArrayList<Teachers> teacherData() throws FileNotFoundException {
        File file = new File("src/TeacherFile"); // reads file with all course data from data doc
        Scanner scan;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Teachers> teachers = new ArrayList<>();
        ArrayList<Department> departments = SaturnDataMaker.DepartmentData();
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

