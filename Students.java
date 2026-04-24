public class Students {
    private String name;
    private static int ID;

    public Students(String name) {
        this.name = name;
        ID++;
    }

    @Override
    public String toString() {
        return "INSERT INTO Students VALUES ('" + name + "');";
    }
}
