
/*
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
    */

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // TEST 1: Basic parking / unparking
        // ==========================================
        System.out.println("=== TEST 1: Basic parking/unparking ===");

        ParkingLot parkingLot1 = new ParkingLot(1);

        Vehicle car1 = new Vehicle("CAR001", VehicleType.CAR);

        String ticket1 = parkingLot1.parkVehicle(car1);

        if (!ticket1.isEmpty()) {
            System.out.println("PASS: CAR gets ticket");
        } else {
            System.out.println("FAIL: CAR did not get ticket");
        }

        parkingLot1.unparkVehicle(ticket1);

        Vehicle car2 = new Vehicle("CAR002", VehicleType.CAR);
        String ticket2 = parkingLot1.parkVehicle(car2);

        if (!ticket2.isEmpty()) {
            System.out.println("PASS: Unparked CAR spot can be reused");
        } else {
            System.out.println("FAIL: Unparked CAR spot could not be reused");
        }


        // ==========================================
        // TEST 2: Different vehicle types
        // ==========================================
        System.out.println("\n=== TEST 2: Different vehicle types ===");

        ParkingLot parkingLot2 = new ParkingLot(1);

        Vehicle bike = new Vehicle("BIKE001", VehicleType.BIKE);
        Vehicle truck = new Vehicle("TRUCK001", VehicleType.TRUCK);

        String bikeTicket = parkingLot2.parkVehicle(bike);
        String truckTicket = parkingLot2.parkVehicle(truck);

        if (!bikeTicket.isEmpty()) {
            System.out.println("PASS: BIKE parks");
        } else {
            System.out.println("FAIL: BIKE did not park");
        }

        if (!truckTicket.isEmpty()) {
            System.out.println("PASS: TRUCK parks");
        } else {
            System.out.println("FAIL: TRUCK did not park");
        }


        // ==========================================
        // TEST 3: Multi-floor CAR traversal
        // ==========================================
        System.out.println("\n=== TEST 3: Multi-floor CAR traversal ===");

        ParkingLot parkingLot3 = new ParkingLot(2);

        int parkedCars = 0;

        for (int i = 1; i <= 8; i++) {
            Vehicle car = new Vehicle("CAR" + i, VehicleType.CAR);
            String ticket = parkingLot3.parkVehicle(car);

            if (!ticket.isEmpty()) {
                parkedCars++;
            }
        }

        if (parkedCars == 8) {
            System.out.println("PASS: First 8 CARs park across 2 floors");
        } else {
            System.out.println("FAIL: Only " + parkedCars + " CARs parked");
        }

        Vehicle ninthCar = new Vehicle("CAR9", VehicleType.CAR);
        String ninthTicket = parkingLot3.parkVehicle(ninthCar);

        if (ninthTicket.isEmpty()) {
            System.out.println("PASS: 9th CAR gets no ticket");
        } else {
            System.out.println("FAIL: 9th CAR unexpectedly got a ticket");
        }


        // ==========================================
        // TEST 4: Ticket uniqueness
        // ==========================================
        System.out.println("\n=== TEST 4: Ticket uniqueness ===");

        ParkingLot parkingLot4 = new ParkingLot(1);

        Vehicle vehicleA = new Vehicle("AAA001", VehicleType.CAR);
        Vehicle vehicleB = new Vehicle("BBB001", VehicleType.CAR);

        String ticketA = parkingLot4.parkVehicle(vehicleA);
        String ticketB = parkingLot4.parkVehicle(vehicleB);

        if (!ticketA.isEmpty()
                && !ticketB.isEmpty()
                && !ticketA.equals(ticketB)) {

            System.out.println("PASS: Ticket IDs are different");

        } else {
            System.out.println("FAIL: Ticket IDs are not unique");
        }
    }
}