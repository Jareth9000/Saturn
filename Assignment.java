public class Assignment {
    private static int ID = 1;
    private int assignmentID;
    private int studentID;
    private int offeringID;
    private boolean scale;
    private int grade;

    public Assignment(int assignmentID, int studentID, int offeringID, boolean scale, int grade) {
        this.assignmentID = assignmentID;
        this.studentID = studentID;
        this.offeringID = offeringID;
        this.scale = scale;
        this.grade = grade;
        ID++;
    }

    public int getID() {
        return assignmentID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Assignments (AssignmentID,StudentID,OfferingID,Scale,Grade) VALUES (" + assignmentID + "," + studentID + "," + offeringID + "," + scale + "," + grade + ");";
    }
}