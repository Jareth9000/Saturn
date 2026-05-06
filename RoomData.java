import java.util.ArrayList;
import java.io.FileNotFoundException;

public class RoomData {
    public static ArrayList<Rooms> makeRooms() throws FileNotFoundException {
        ArrayList<Rooms> Roomsdata = new ArrayList<>();
        String add = "";
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 1; k < 21; k++){
                    add = "";
                    //first
                    if(i == 0){
                        add += "B";
                    }
                    else{
                        add += i;
                    }
                    //second
                    if(j == 0){
                        add += "N";
                    }
                    else if(j == 1){
                        add += "S";
                    }
                    else if(j == 2){
                        add += "E";
                    }
                    else{
                        add += "W";
                    }
                    //third
                    add += k;
                    Roomsdata.add(new Rooms(add));
                }
            }
        }
        return Roomsdata;
    }
}