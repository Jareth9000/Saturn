import java.util.ArrayList;

public class RoomData {
    public static void main(String[] args) {
        ArrayList<Rooms> data = new ArrayList<>();
        String add = "";
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 1; k < 21; k++){
                    add = "";
                    if(i == 0){
                        add += "B";
                    }
                    else{
                        add += i;
                    }
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
