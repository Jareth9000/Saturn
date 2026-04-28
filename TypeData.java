import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TypeData {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Type> types = new ArrayList<>();
        types.add(new Type("Elective"));
        types.add(new Type("Regents course"));
        types.add(new Type("AP course"));
    }
}