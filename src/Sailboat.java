public class Sailboat extends Boat implements Validation {

    private int _numberPole;

    public Sailboat(Captain captain) {
        super(captain);
    }

    public Sailboat(Captain captain, double basePrice, int fabricationAge, float length) {
        super(captain,basePrice,fabricationAge,length);
    }

    public Sailboat(Captain captain, double basePrice, int fabricationAge, float length, int numberPole) {
        super(captain,basePrice,fabricationAge,length);
        this._numberPole = numberPole;
    }


    public int getNumberPole() {
        return this._numberPole;
    }

    public void setNumberPole(int numberPole) {
        this._numberPole = numberPole;
    }

    @Override
    public String validate() {
        // TODO Auto-generated method stub
        if (this._numberPole > 4){
            return "Grande";
        }else{
            return "Estandar";
        }
    }

    @Override
    public String toString() {
        return "Sailboat(" + super.toString() + ", Mastiles: " + this.getNumberPole() + ")";
    }

    
}
