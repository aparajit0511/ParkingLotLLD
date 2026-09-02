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

    public void findAvailableSpot(int key){

    }
}

