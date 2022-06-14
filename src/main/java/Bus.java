import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus() {
        this.destination = new String();
        this.capacity = 3;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void pickUpPerson(BusStop busStop){
        Person person = busStop.removePerson();
        this.passengers.add(person);
    }
}
