import java.time.LocalDateTime;

public class ParkingTicket {
    private String ticketId;
    public Vehicle vehicle;
    public ParkingSpotType parkingSpot;
    private LocalDateTime entryTime;

    public ParkingTicket(String ticketId, Vehicle vehicle, ParkingSpotType parkingSpot, LocalDateTime entryTime){
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getEntryTime(){
        return this.entryTime;
    }

    public void setEntryTime(){
        this.entryTime = LocalDateTime.now();
    }
}
