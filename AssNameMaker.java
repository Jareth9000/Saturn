import java.util.ArrayList;

public class AssNameMaker {
    public static ArrayList<AssignmentNames> makeAssignmentNames() {

        ArrayList<AssignmentNames> assNamesData = new ArrayList<>();
        AssignmentNames C1 = new AssignmentNames("Class Work 1");
        AssignmentNames H1 = new AssignmentNames("Homework 1");
        AssignmentNames C2 = new AssignmentNames("Class Work 2");
        AssignmentNames H2 = new AssignmentNames("Homework 2");
        AssignmentNames T1 = new AssignmentNames("Test 1");
        AssignmentNames C3 = new AssignmentNames("Class Work 3");
        AssignmentNames H3 = new AssignmentNames("Homework 3");
        AssignmentNames C4 = new AssignmentNames("Class Work 4");
        AssignmentNames H4 = new AssignmentNames("Homework 4");
        AssignmentNames T2 = new AssignmentNames("Test 2");
        AssignmentNames C5 = new AssignmentNames("Class Work 5");
        AssignmentNames H5 = new AssignmentNames("Homework 5");
        AssignmentNames C6 = new AssignmentNames("Class Work 6");
        AssignmentNames H6 = new AssignmentNames("Homework 6");
        AssignmentNames T3 = new AssignmentNames("Test 3");

        assNamesData.add(C1);
        assNamesData.add(H1);
        assNamesData.add(C2);
        assNamesData.add(H2);
        assNamesData.add(T1);
        assNamesData.add(C3);
        assNamesData.add(H3);
        assNamesData.add(C4);
        assNamesData.add(H4);
        assNamesData.add(T2);
        assNamesData.add(C5);
        assNamesData.add(H5);
        assNamesData.add(C6);
        assNamesData.add(H6);
        assNamesData.add(T3);

        return assNamesData;
    }

}
