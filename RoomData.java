import java.util.ArrayList;
import java.io.FileNotFoundException;

public class RoomData {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Rooms> data = new ArrayList<>();
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
                    data.add(new Rooms(add));
                }
            }
        }
        for(Rooms print: data){
            System.out.println(print.toString());
        }
    }
}
