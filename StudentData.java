import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentData{
    public static ArrayList<Students> studentData() throws FileNotFoundException {
        ArrayList<Students> studentsData = new ArrayList<>();
        File file = new File("src//StudentFile");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String studentName = scanner.nextLine();
            studentsData.add(new Students(studentName));
        }
        return studentsData;
    }
}