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

    public void parkAVehicle(Vehicle vehicle){

    }

    public void unparkAVehicle(Vehicle vehicle){
    }

}
