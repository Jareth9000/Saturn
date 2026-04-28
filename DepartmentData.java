import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src//data");
        Scanner scan = new Scanner(file);
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(new Department("Biological Sciences"));
        departments.add(new Department("Chemistry"));
        departments.add(new Department("CTE, Computer Science & Engineering\n"));
        departments.add(new Department("English"));
        departments.add(new Department("Health & PE"));
        departments.add(new Department("Mathematics"));
        departments.add(new Department("Physics"));
        departments.add(new Department("Social Studies"));
        departments.add(new Department("Special Education"));
        departments.add(new Department("Visual & Performing Arts"));
        departments.add(new Department("World Languages & ENL"));
    }
}
