public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehicle vehicle = new Vehicle("AXB11",VehicleType.valueOf("CAR"));

        ParkingLot parkingLot = new ParkingLot(10);
        String ticket = parkingLot.parkVehicle(vehicle);
        System.out.println("Ticket for parked vehicle: "+ticket);
        parkingLot.unparkVehicle(ticket);

    }
}