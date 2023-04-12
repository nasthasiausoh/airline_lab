import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    Runner runner;
    Passenger passenger;
    Flight flight;

    ArrayList<Passenger> passengers;
    ArrayList<Flight> flights;
    private String airlineName;

    public static void main(String[] args) {
        Airline airline = new Airline("BNTAir");

        Flight flight1 = new Flight("London", "Greece", "8am", "2pm", 3597);
        Flight flight2 = new Flight("Luton", "Paris", "12pm", "2:30pm", 5640);
        Flight flight3 = new Flight("Gatwick", "Rome", "6pm", "9pm", 1682);

        airline.addFlight(flight1);
        airline.addFlight(flight2);
        airline.addFlight(flight3);


        Passenger passenger1 = new Passenger("John", "john@gmail.com", 0001, "male");
        Passenger passenger2 = new Passenger("Samantha", "sammy@gmail.com", 0002, "female");
        Passenger passenger3 = new Passenger("George", "george@hotmail.co.uk", 0003, "female");
        flight1.addPassenger(passenger1);
        flight2.addPassenger(passenger2);
        flight3.addPassenger(passenger3);



        System.out.println("Welcome to BNTAir check-in!");

        while (true) {
            System.out.println("Please select an option.\n" +
                    "Enter 1 to display all available flights.\n" +
                    "Enter 2 to create a new flight.\n" +
                    "Enter 3 to cancel a flight.\n" +
                    "Enter 4 to book a passenger onto a flight.\n" +
                    "Enter 5 to cancel a booking.\n" +
                    "And enter q if you wish to quit.");


            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();


        }
    }
}



