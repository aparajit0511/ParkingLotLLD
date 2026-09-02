import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private HashMap<Integer,Floor> floors;

    public ParkingLot(int numberOfFloors){
        floors = new HashMap<>();
        for(int i=1;i<=numberOfFloors;i++){
            floors.put(i,new Floor(10));
        }
    }


    public void parkVehicle(Vehicle vehicle){
        String vehicleType = String.valueOf(vehicle.getVehicleType());
        for(Map.Entry<Integer,Floor> floormap:floors.entrySet()){
            Integer key = floormap.getKey();
            Floor floor = floormap.getValue();
            String spotId = floor.findAvailableSpot(vehicleType);
            System.out.println(floor);
        }
    }

}
