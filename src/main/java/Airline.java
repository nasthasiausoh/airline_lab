import java.util.ArrayList;
import java.util.Scanner;

public class Airline {

    Scanner scanner = new Scanner(System.in);

    private String airlineName;
    private ArrayList<Flight> flights;

    public Airline(String airline) {
        this.airlineName = airline;
        this.flights = new ArrayList<>();
    }

    //Methods
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public void displayFlights() {
        System.out.println("Available flights are listed below:");
        for (Flight flight : flights) {
            System.out.println(flight.getFlightNumber() + ": flying to " + flight.getArrivalLocation() + ", from " + flight.getDepartureLocation() + ". Number of passengers booked for this flight: " + flight.getPassengers().size() + ".");
        }
    }

    public void createNewFlight() {
        System.out.println("Please enter a flight destination.");
        String destination = scanner.nextLine();
        System.out.printf("Now please enter a departure location.");   //printf means: to format
        String departure = scanner.nextLine();
    }

    public void cancelFlight() {
        System.out.println("Please enter your flight number:");
        int flightNumber = scanner.nextInt();
        Flight flightToCancel = findFlight(flightNumber);
        try {
            System.out.println("Flight " + flightToCancel.getFlightNumber() + " successfully cancelled.");
            flights.remove(flightToCancel);
        } catch (Exception e) {
            System.out.println("Please enter a valid flight number using the correct format.");
        }
    }

    public Flight findFlight(int flightNumber) {
        Flight foundFlight = null;
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                foundFlight = flight;
                break;
            }
        }
        return foundFlight;
    }

    //Getters and setters
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
