import java.util.HashMap;

public class ParkingLot {

    private int numberOfFloors;


    public ParkingLot(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }

    public void parkVehicle(){
        HashMap<Integer,Floor> floors = new HashMap<>();
//        Floor floor = new Floor();
        for (int i = 0;i<numberOfFloors;i++){
            floors.put(i,new Floor(i));
        }
    }

}
