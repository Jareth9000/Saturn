import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TypeData {
    public static ArrayList<Type> makeTypes() throws FileNotFoundException {
        ArrayList<Type> types = new ArrayList<>();
        types.add(new Type("Elective"));
        types.add(new Type("Regents course"));
        types.add(new Type("AP course"));
        for (Type type:types) {
            System.out.println(type.toString());
        }
        return types;
    }
}