public class Boat {

    private Captain captain;
    private double basePrice;
    private double aditionalPrice;
    private int fabricationAge;
    private float length;

    public Boat(Captain captain) {
        this.captain = captain;
    }

    public Boat(Captain captain, double basePrice, double aditionalPrice, int fabricationAge, float length) {
        this.captain = captain;
        this.basePrice = basePrice;
        this.aditionalPrice = aditionalPrice;
        this.fabricationAge = fabricationAge;
        this.length = length;
    }

    public Captain getCaptain() {
        return this.captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getAditionalPrice() {
        return this.aditionalPrice;
    }

    public void setAditionalPrice(double aditionalPrice) {
        this.aditionalPrice = aditionalPrice;
    }

    public int getFabricationAge() {
        return this.fabricationAge;
    }

    public void setFabricationAge(int fabricationAge) {
        this.fabricationAge = fabricationAge;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

}
