import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {
    private String ticketId;
    public Vehicle vehicle;
    public ParkingSpotType parkingSpot;
    private LocalDateTime entryTime;

    public ParkingTicket( Vehicle vehicle, ParkingSpotType parkingSpot){
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId() {
        this.ticketId = UUID.randomUUID().toString();
    }

    public LocalDateTime getEntryTime(){
        return this.entryTime;
    }

    public void setEntryTime(){
        this.entryTime = LocalDateTime.now();
    }

    public String generateTicket(){
        ticketId = getTicketId();
        entryTime = getEntryTime();
        return ticketId + " " + entryTime;
    }
}
