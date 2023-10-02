public class Sailboat extends Boat {

    private int _numberPole;

    public Sailboat(Captain captain) {
        super(captain);
    }

    public Sailboat(Captain captain, double basePrice, double aditionalPrice, int fabricationAge, float length) {
        super(captain,basePrice,aditionalPrice,fabricationAge,length);
    }

    public Sailboat(Captain captain, double basePrice, double aditionalPrice, int fabricationAge, float length, int numberPole) {
        super(captain,basePrice,aditionalPrice,fabricationAge,length);
        this._numberPole = numberPole;
    }


    public int getNumberPole() {
        return this._numberPole;
    }

    public void setNumberPole(int numberPole) {
        this._numberPole = numberPole;
    }

    
}
