import java.util.ArrayList;

public class RosterData {
    public static ArrayList<Roster> RosterData(){
        ArrayList<Roster> rosterData = new ArrayList<>();
        ArrayList<Students> studentList = StudentData.studentData();
        ArrayList<Offerings> offerings = OfferingsData.offeringsData();
        for(Students student: studentList){
            for(int i = 1; i <= 10; i++){
                int random = (int)(Math.random() * offerings.size());
                while(offerings.get(random).getPeriod() != i){
                    random = (int)(Math.random() * offerings.size());
                }
                rosterData.add( new Roster(offerings.get(random).getID(), student.getStudentID()));
            }
        }
        return rosterData;
    }
}
