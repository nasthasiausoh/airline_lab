import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    Passenger passenger;

    ArrayList<Passenger> passengers;
    ArrayList<Flight> flights;
    private String airlineName;

    public Runner(String airlineName){
        this.airlineName = airlineName;
        this.passengers = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    //Methods:

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void removePassenger( Passenger passenger){
        passengers.remove(passenger);
    }

    public int countPassenger(){
        return this.passengers.size();
    }

//    public void addFlight(Passenger passenger){
//        passengers.add(passenger);
//    }
//
//    public void removePassenger( Passenger passenger){
//        passengers.remove(passenger);
//    }
//public int countPassenger(){
//    return this.passengers.size();
//}



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input personal information to access your flight details.");

        while(true) {

            String input = scanner.nextLine();

        }
    }
}
