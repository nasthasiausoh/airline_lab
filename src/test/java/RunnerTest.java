import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RunnerTest {
    Runner runner;
    Passenger passenger;
    Flight flight;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger("John", "john@gmail.com", 0001, "male");
    }

    @Test
    public void canAddPassenger(){
        Passenger passenger1 = new Passenger("John", "john@gmail.com", 0001, "male");
        Passenger passenger2 = new Passenger("Samantha", "sammy@gmail.com", 0002, "female");
        Passenger passenger3 = new Passenger("George", "george@hotmail.co.uk", 0003, "female");
        runner.addPassenger(passenger1);
        runner.addPassenger(passenger2);
        runner.addPassenger(passenger3);
        assertThat(runner.countPassenger()).isEqualTo(3);
    }

}
