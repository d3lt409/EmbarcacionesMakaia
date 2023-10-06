public class Boat {

    protected Captain captain;
    protected double basePrice;
    protected double aditionalPrice = 0;
    protected int fabricationAge;
    protected float length;

    public Boat(Captain captain) {
        this.captain = captain;
    }

    public Boat(Captain captain, double basePrice, int fabricationAge, float length) {
        this.captain = captain;
        this.basePrice = basePrice;
        if (fabricationAge > 2020){
            this.aditionalPrice = 20000;
        }
        
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

    public int getFabricationAge() {
        return this.fabricationAge;
    }

    public void setFabricationAge(int fabricationAge) {
        this.fabricationAge = fabricationAge;
        if (fabricationAge > 2020){
            this.aditionalPrice = 20000;
        }
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        if (this.aditionalPrice > 0) {
            return "Capitán(" + captain + ")\n"+
                "Precio base: " + basePrice + ", Precio adicional: " + aditionalPrice +  ", Año de fabricacion: " + this.fabricationAge + ", Eslora: " + this.length ;
        }
        return "Capitán(" + captain + ")\n"+
         "Precio base: " + basePrice + ", Año de fabricacion: " + this.fabricationAge + ", Eslora: " + this.length ;
    }

}
