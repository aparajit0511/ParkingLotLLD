import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ParkingLot {

    private HashMap<Integer,Floor> floors;

    public ParkingLot(int numberOfFloors){
        floors = new HashMap<>();
        for(int i=1;i<=numberOfFloors;i++){
            floors.put(i,new Floor(10));
        }
    }


    public void parkVehicle(Vehicle vehicle){

//        HashMap<VehicleType, ParkingSpotType> typeMap = new HashMap<>();
//
//        typeMap.put(VehicleType.CAR, ParkingSpotType.CAR_SPOT);
//        typeMap.put(VehicleType.BIKE, ParkingSpotType.BIKE_SPOT);
//        typeMap.put(VehicleType.TRUCK, ParkingSpotType.TRUCK_SPOT);

//        String spotId = "";
//        int floorNumber = 0;
        String vehicleType = String.valueOf(vehicle.getVehicleType());
//        typeMap.get(vehicle.getVehicleType());
        for(Map.Entry<Integer,Floor> floormap:floors.entrySet()){
            Integer key = floormap.getKey();
            Floor floor = floormap.getValue();
            ParkingSpot parkingSpot = floor.findAvailableSpot(vehicleType);
            if(parkingSpot != null){
                parkingSpot.parkAVehicle(vehicle);
                
//                floorNumber = key;
            }else{
                return ;
            }
//             spotId = floor.findAvailableSpot(vehicleType);
            System.out.println(floor);
        }
        
    }

}
