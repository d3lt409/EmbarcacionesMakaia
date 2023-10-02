public class Yacht extends Boat {

    public int cabinsNumber;

    public Yacht(Captain captain) {
        super(captain);
    }

    public Yacht(Captain captain, double basePrice, double aditionalPrice, int fabricationAge, float length) {
        super(captain, basePrice, aditionalPrice, fabricationAge, length);

    }

    public Yacht(Captain captain, double basePrice, double aditionalPrice, int fabricationAge, float length,
            int cabinsNumber) {
        super(captain, basePrice, aditionalPrice, fabricationAge, length);

        this.cabinsNumber = cabinsNumber;
    }

    public int getCabinsNumber() {
        return this.cabinsNumber;
    }

    public void setCabinsNumber(int cabinsNumber) {
        this.cabinsNumber = cabinsNumber;
    }

}
