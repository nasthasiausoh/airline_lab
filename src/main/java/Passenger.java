import java.math.BigInteger;
import java.util.ArrayList;

public class Passenger {

    private String name;
    private String email;
    private int id;
    private String gender;

    public Passenger(String name, String email, int id, String gender){
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // getters and setters:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
