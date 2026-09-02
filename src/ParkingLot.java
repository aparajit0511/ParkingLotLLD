import java.util.HashMap;

public class ParkingLot {

    private int numberOfFloors;
    private HashMap<Integer,Floor> floors;

    public ParkingLot(int numberOfFloors){
        floors = new HashMap<>();
        for(int i=1;i<=10;i++){
            floors.put(i,new Floor(i));
        }
    }


    public void parkVehicle(){

    }

}
