import java.util.ArrayList;

public class DepartmentData {
    public static ArrayList<Department> departmentData() {
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
        return departments;
    }
}
