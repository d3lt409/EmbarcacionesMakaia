import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Sale> sales = new ArrayList<Sale>();
    private List<Boat> boats = new ArrayList<Boat>();
    private List<Person> people = new ArrayList<Person>();

    public Store(Boat boat) {
        this.boats.add(boat);
    }

    public Store(List<Boat> boats) {
        this.boats.addAll(boats);
    }

    public void buyYacht(Person person, Yacht yacht) {
        sales.add(new Sale(person, yacht));
    }

    public void rentSailboat(Person person, Sailboat sailboat) {
        sales.add(new Sale(person, sailboat));
    }

    public void addClient(Person client) {
        this.people.add(client);
    }

    public void addBoat(Boat boat) {
        this.boats.add(boat);
    }

    public List<Boat> getBoats() {
        return this.boats;
    }

    public List<Yacht> getYacht(){
        List<Yacht> yachts = new ArrayList<>();
        for (Boat boat : getBoats()) {
            if (boat instanceof Yacht) {
                yachts.add((Yacht) boat);
            }
        }
        return yachts;
    }

    public List<Sailboat> getSailboat(){
        List<Sailboat> sailboat = new ArrayList<>();
        for (Boat boat : getBoats()) {
            if (boat instanceof Sailboat) {
                sailboat.add((Sailboat) boat);
            }
        }
        return sailboat;
    }



}
