import java.util.HashMap;

public class Floor {
    private int floorNumber;
    private HashMap<String,ParkingSpot> spots;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        spots = new HashMap<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public HashMap<String, ParkingSpot> getSpots() {
        return spots;
    }

    public void setSpots(HashMap<String, ParkingSpot> spots) {
        this.spots = spots;
    }

}

