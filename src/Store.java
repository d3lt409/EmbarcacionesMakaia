import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Sale> sales = new ArrayList<Sale>();
    private List<Boat> boats = new ArrayList<Boat>();
    private List<Person> people = new ArrayList<Person>();    
    private List<Captain> captains = new ArrayList<Captain>();


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

    public List<Sale> getSales(){
        return sales;
    }

    public void addClient(Person client) {
        this.people.add(client);
    }

    public void addCaptain(Captain captain) {
        this.captains.add(captain);
    }

    public void addCaptains(List<Captain> captains) {
        this.captains.addAll(captains);
    }

    public List<Captain> getCaptains(){
        return this.captains;
    }

    public List<Captain> getAvailableCaptains(){
        List<Captain> captains = this.captains;
        for (Sale sale : sales) {
            captains.remove(sale.getBoat().getCaptain());
        }
        return captains;
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

    public List<Yacht> getAvailableYacht(){
        List<Yacht> yachts = getYacht();
        for (Sale sale : sales) {
            if (sale.getBoat() instanceof Yacht) {
                yachts.remove(sale.getBoat());
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

    public List<Sailboat> getAvailableSailboat(){
        List<Sailboat> sailboats = getSailboat();
        for (Sale sale : sales) {
            if (sale.getBoat() instanceof Sailboat) {
                sailboats.remove(sale.getBoat());
            }
        }
        return sailboats;
    }



}
