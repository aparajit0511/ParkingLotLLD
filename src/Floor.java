import java.util.HashMap;

public class Floor {
    private int floorNumber;
//    private HashMap<String,ParkingSpot> spots;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
//        this.spots = spots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

}

