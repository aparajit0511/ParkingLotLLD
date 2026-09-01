import java.time.LocalDateTime;

public class ParkingSpot {
    private String spotId;
    private int floorNumber;
    private ParkingSpotType parkingSpotType;
    public Vehicle vehicle;

    public ParkingSpot(String spotId,int floorNumber, ParkingSpotType parkingSpotType,Vehicle vehicle){
        this.spotId = spotId;
        this.floorNumber = floorNumber;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = vehicle;
    }

    public String getSpotId(){
        return spotId;
    }

    public void setSpotId(String spotId){
        this.spotId = spotId;
    }

    public int getFloorNumber(){
        return this.floorNumber;
    }

    public void setFloorNumber(int floorNumber){
        this.floorNumber = floorNumber;
    }

    public ParkingSpotType getParkingSpotType(){
        return this.parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType){
        this.parkingSpotType = parkingSpotType;
    }

    public boolean isOccupied(Vehicle vehicle){
        if(vehicle == null){
            return false;
        }
        return true;
    }

    public String parkAVehicle(Vehicle vehicle){
        if(!isOccupied(vehicle)){
            ParkingTicket parkingTicket = new ParkingTicket("TCK123",vehicle,getParkingSpotType(), LocalDateTime.now());
            return parkingTicket.getTicketId();
        }
        return "Occupied";
    }

    public boolean unparkAVehicle(Vehicle vehicle){
        if(isOccupied(vehicle)){
            return this.vehicle == null;
        }
        return false;
    }

}
