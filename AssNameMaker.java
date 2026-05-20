import java.util.ArrayList;

public class AssNameMaker {
    public static ArrayList<AssignmentNames> makeAssignmentNames() {


        ArrayList<AssignmentNames> assNamesData = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {

            assNamesData.add(new AssignmentNames("Classwork " + i));
            assNamesData.add(new AssignmentNames("Homework " + i));
            if (i % 2 == 0) {
                assNamesData.add(new AssignmentNames("Test " + i / 2));
            }
        }
        System.out.println();
        return assNamesData;
    }

}
