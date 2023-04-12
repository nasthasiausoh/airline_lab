import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Flight {

    private String departureLocation;
    private String arrivalLocation;
    private String localDepartureTime;
    private String localArrivalTime;
    private int flightNumber;

    public Flight(String departureLocation, String arrivalLocation, String localDepartureTime, String localArrivalTime, int flightNumber){
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.localDepartureTime = localDepartureTime;
        this.localArrivalTime =localArrivalTime;
        this.flightNumber = flightNumber;
    }

    // getters and setters
    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getLocalDepartureTime() {
        return localDepartureTime;
    }

    public void setLocalDepartureTime(String localDepartureTime) {
        this.localDepartureTime = localDepartureTime;
    }

    public String getLocalArrivalTime() {
        return localArrivalTime;
    }

    public void setLocalArrivalTime(String localArrivalTime) {
        this.localArrivalTime = localArrivalTime;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }


/*
Methods: a function to add new flight, remove (/cancel?) a flight, display all available flights,
Might need a booking variable? where the customer can book a new flight, or cancel a flight from their booking.
  So would go in the passenger class?
  Whereas removing a flight would be removing it from flight array list (unavailable)- so would remain in this class??
 */



}
