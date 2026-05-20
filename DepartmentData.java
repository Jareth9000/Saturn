import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentData{
    public static ArrayList<Department> DepartmentData() throws FileNotFoundException {
        ArrayList<Department> departmentData = new ArrayList<>();
        File file = new File("src//DepartmentFile");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            departmentData.add(new Department(scanner.nextLine()));
        }
        return departmentData;
    }
}