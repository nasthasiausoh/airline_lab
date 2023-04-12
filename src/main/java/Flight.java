import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
        Scanner scanner = new Scanner(System.in);
        private String departureLocation;
        private String arrivalLocation;
        private String localDepartureTime;
        private String localArrivalTime;
        private int flightNumber;
        private ArrayList<Passenger> passengers;

    public Flight(String departureLocation, String arrivalLocation, String localDepartureTime, String localArrivalTime,
        int flightNumber){
            this.departureLocation = departureLocation;
            this.arrivalLocation = arrivalLocation;
            this.localDepartureTime = localDepartureTime;
            this.localArrivalTime = localArrivalTime;
            this.flightNumber = flightNumber;
            this.passengers = new ArrayList<>();
        }

        public void bookNewPassenger () {
            System.out.println("Please enter the passenger's name:");
            String name = scanner.nextLine();
            System.out.println("Now please enter the passenger's email address:");
            String email = scanner.nextLine();
            System.out.println("Now please enter the passenger's ID number:");
            int id = scanner.nextInt();
            System.out.println("Now please enter the passenger's gender");
            String gender = scanner.nextLine();
            Passenger newPassenger = new Passenger(name, email, id, gender);
            this.passengers.add(newPassenger);
            System.out.println("Passenger successfully booked onto flight " + this.getFlightNumber() + ".");
        }

        public void cancelBooking () {
            System.out.println("Please enter the passenger's ID number.");
            int id = scanner.nextInt();
            Passenger passengerToCancel = findPassenger(id);
            if (passengerToCancel == null) {
                System.out.println("Please enter a valid ID number.");
            } else {
                this.removePassenger(passengerToCancel);
            }
        }

        public Passenger findPassenger (int id){
            Passenger foundPassenger = null;
            for (Passenger passenger : passengers) {
                if (passenger.getId() == id) {
                    System.out.println(passenger.getName() + "'s booking has been cancelled.");
                    foundPassenger = passenger;
                    break;
                }
            }
            return foundPassenger;
        }


//    methods
        public void addPassenger (Passenger passenger){
            passengers.add(passenger);
        }

        public void removePassenger (Passenger passenger){
            passengers.remove(passenger);
        }

        // getters and setters
        public String getDepartureLocation () {
            return departureLocation;
        }

        public void setDepartureLocation (String departureLocation){
            this.departureLocation = departureLocation;
        }

        public String getArrivalLocation () {
            return arrivalLocation;
        }

        public void setArrivalLocation (String arrivalLocation){
            this.arrivalLocation = arrivalLocation;
        }

        public String getLocalDepartureTime () {
            return localDepartureTime;
        }

        public void setLocalDepartureTime (String localDepartureTime){
            this.localDepartureTime = localDepartureTime;
        }

        public String getLocalArrivalTime () {
            return localArrivalTime;
        }

        public void setLocalArrivalTime (String localArrivalTime){
            this.localArrivalTime = localArrivalTime;
        }

        public int getFlightNumber () {
            return flightNumber;
        }

        public void setFlightNumber ( int flightNumber){
            this.flightNumber = flightNumber;
        }

        public ArrayList<Passenger> getPassengers () {
            return passengers;
        }

        public void setPassengers (ArrayList < Passenger > passengers) {
            this.passengers = passengers;
        }
}
