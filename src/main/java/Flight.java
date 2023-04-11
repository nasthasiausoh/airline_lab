import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    Scanner scanner = new Scanner(System.in);


/*
Variable we need:
    string airlineName, array list of available flights,
    flight origin & flight destinations, number of seats available??? maybe.
    Maybe create an enum which contains all available flight destinations/locations
            - (could assume all flights depart from London and just have an arrival location?)
    departure times -LocalDateTime departureTime,

 */

/*
Methods: a function to add new flight, remove (/cancel?) a flight, display all available flights,
Might need a booking variable? where the customer can book a new flight, or cancel a flight from their booking.
  So would go in the passenger class?
  Whereas removing a flight would be removing it from flight array list (unavailable)- so would remain in this class??
 */
    private String airlineName;

    private ArrayList<Flight> flights;



}
