public class Roster {
    private final int OfferingID;
    private final int StudentID;

    private Roster(int OfferingID, int StudentID){
        this.OfferingID = OfferingID;
        this.StudentID = StudentID;
    }

    @Override
    public String toString(){
        return "INSERT INTO Rosters (OfferingID, StudentID) VALUES (" + OfferingID + ", " + StudentID + ");";
    }
}