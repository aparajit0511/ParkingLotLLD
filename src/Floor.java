import java.util.HashMap;
import java.util.Map;

public class Floor {
    private int numberOfSpots;
    private HashMap<String,ParkingSpot> spots;

    public Floor(int numberOfSpots){
        this.numberOfSpots = numberOfSpots;
        spots = new HashMap<>();
        for(int i = 1; i <= numberOfSpots; i++) {
            char letter = (char) ('A' + i / 2);
            int number = (i % 2) + 1;

            String spotId = "" + letter + number;

            ParkingSpotType spotType;

            if(i <= 4) {
                spotType = ParkingSpotType.CAR_SPOT;
            } else if(i <= 7) {
                spotType = ParkingSpotType.BIKE_SPOT;
            } else {
                spotType = ParkingSpotType.TRUCK_SPOT;
            }

            spots.put(spotId, new ParkingSpot(spotId,i, spotType, null));
        }
    }

    public ParkingSpot findAvailableSpot(String vehicleType){
        for(Map.Entry<String,ParkingSpot> spots: spots.entrySet()){
            String keySpotId = spots.getKey();
            ParkingSpot parkingSpot = spots.getValue();
            String checkVehicleType = String.valueOf(parkingSpot.getParkingSpotType());
            if ( checkVehicleType == null){
                return parkingSpot;
            }
        }
        return null;
    }
}

