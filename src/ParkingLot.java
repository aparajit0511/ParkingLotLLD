import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private HashMap<Integer,Floor> floors;
    private HashMap<VehicleType, ParkingSpotType> typeMap = new HashMap<>();

    private HashMap<String,ParkingSpot> ticketMap = new HashMap<>();

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
        ParkingSpot parkingSpot = null;
                String vehicleType = String.valueOf(vehicle.getVehicleType());
                ParkingSpotType spotType = typeMap.get(vehicle.getVehicleType());
        for(Map.Entry<Integer,Floor> floormap:floors.entrySet()){
            Integer key = floormap.getKey();
            Floor floor = floormap.getValue();
            parkingSpot = floor.findAvailableSpot(vehicleType,spotType);

            if(parkingSpot != null){
                parkingSpot.parkAVehicle(vehicle);
                System.out.println("Spotid: "+parkingSpot.getSpotId());
                break; // to come out of the loop and create a ticket

            }else{
                return "";
            }
        }

        ParkingTicket parkingTicket = new ParkingTicket(vehicle,typeMap.get(vehicle.getVehicleType()));
        String ticketId = parkingTicket.generateTicket();
        ticketMap.put(ticketId,parkingSpot);

        System.out.println(ticketMap);
        return ticketId;
        
    }



    public void unparkVehicle(String ticket) {

        ParkingSpot parkingSpot = ticketMap.get(ticket);
        parkingSpot.unparkAVehicle();
    }
}
