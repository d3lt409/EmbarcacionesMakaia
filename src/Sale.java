
public class Sale {
    private Person person;
    private Boat boat;

    public Sale(Person person, Boat boat) {
        this.person = person;
        this.boat = boat;
    }

    public Person getPerson() {
        return this.person;
    }


    public Boat getBoat() {
        return this.boat;
    }

    @Override
    public String toString() {
        return "Sale{" + this.person + "," + this.boat + "}";
    }


}
