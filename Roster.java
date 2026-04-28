public class Roster {
    private int OfferingID;
    private int StudentID;

    private Roster(int OfferingID, int StudentID){
        this.OfferingID = OfferingID;
        this.StudentID = StudentID;
    }

    @Override
    public String toString(){
        return "INSERT INTO Rosters (OfferingID, StudentID) VALUES (" + OfferingID + ", " + StudentID + ");";
    }
}
