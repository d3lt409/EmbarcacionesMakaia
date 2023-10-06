public class Yacht extends Boat implements Validation {

    public int cabinsNumber;

    public Yacht(Captain captain) {
        super(captain);
    }

    public Yacht(Captain captain, double basePrice, int fabricationAge, float length) {
        super(captain, basePrice, fabricationAge, length);

    }

    public Yacht(Captain captain, double basePrice, int fabricationAge, float length,
            int cabinsNumber) {
        super(captain, basePrice, fabricationAge, length);

        this.cabinsNumber = cabinsNumber;
    }

    public int getCabinsNumber() {
        return this.cabinsNumber;
    }

    public void setCabinsNumber(int cabinsNumber) {
        this.cabinsNumber = cabinsNumber;
    }

    @Override
    public String validate() {
        // TODO Auto-generated method stub
        if (this.cabinsNumber > 7) {
            return "Lujoso";
        } else {
            return "Estandar";
        }
    }

    @Override
    public String toString() {
        return "Yacht(" + super.toString() + ", Camarotes: " + this.cabinsNumber + ")";
    }

}
