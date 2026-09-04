import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private HashMap<Integer,Floor> floors;
    private HashMap<VehicleType, ParkingSpotType> typeMap = new HashMap<>();

    public ParkingLot(int numberOfFloors){
        floors = new HashMap<>();
        for(int i=1;i<=numberOfFloors;i++){
            floors.put(i,new Floor(10));
        }

        typeMap.put(VehicleType.CAR, ParkingSpotType.CAR_SPOT);
        typeMap.put(VehicleType.BIKE, ParkingSpotType.BIKE_SPOT);
        typeMap.put(VehicleType.TRUCK, ParkingSpotType.TRUCK_SPOT);
    }



    public String parkVehicle(Vehicle vehicle){

        String vehicleType = String.valueOf(vehicle.getVehicleType());
        for(Map.Entry<Integer,Floor> floormap:floors.entrySet()){
            Integer key = floormap.getKey();
            Floor floor = floormap.getValue();
            ParkingSpot parkingSpot = floor.findAvailableSpot(vehicleType);

            if(parkingSpot != null){
                parkingSpot.parkAVehicle(vehicle);
                System.out.println("Spotid: "+parkingSpot.getSpotId());
                break; // to come out of the loop and create a ticket

            }else{
                return "";
            }
        }

        ParkingTicket parkingTicket = new ParkingTicket(vehicle,typeMap.get(vehicle.getVehicleType()));

        return parkingTicket.generateTicket();
        
    }



    public void unparkVehicle(String ticket) {

    }
}
