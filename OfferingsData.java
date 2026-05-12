import java.util.ArrayList;

public class OfferingsData {
    public static ArrayList<Offerings> offeringsData(String[] args) {
        ArrayList<Course> courses = CourseData.makeCourses();
        ArrayList<Teachers> teachers = TeacherData.teacherData();
        ArrayList<Rooms> rooms  = RoomData.makeRooms();
        ArrayList<Students> students = StudentData.studentData();
        ArrayList<Offerings> offers = new ArrayList<>();
        Period[] periods = new Period[10];
        for (int i = 1; i < 11; i++) {
            periods[i-1] = new Period(i);
        }
        for (Course course: courses) {
            int numOffers = (int) (Math.random() * 5) + 1;
            for (int i = 0; i < numOffers; i++) {
                int periodNumber = (int) (Math.random() * 10) + 1;
                Teachers teacher = teachers.get((int) (Math.random() * teachers.size()));
                Rooms room = rooms.get((int) (Math.random() * rooms.size()));
                boolean check = false;
                while (!check) {
                    teacher = teachers.get((int) (Math.random() * teachers.size()));
                    check = periods[periodNumber - 1].addTeacher(teacher);
                }
                check = false;
                while (!check) {
                    room = rooms.get((int) (Math.random() * rooms.size()));
                    check = periods[periodNumber - 1].addRoom(room);
                }
                Offerings offer = new Offerings(periodNumber,course.getID(),teacher.getID(),room.getID());
                offers.add(offer);
            }
        }
        return offers;
    }
}