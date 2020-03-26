public class SUV extends Vehicle {
    private double cargoSpace;
    public double getCargoSpace() {
        return cargoSpace;
    }
    public void setCargoSpace(double cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
    public SUV() {

    }
    public SUV(int mpg,String color,Engine engine,String vehicleID,int seats,int doors,String make,String model,int mileage,int yr,double price,double cargoSpace) {
        super(mpg,color,engine,vehicleID,seats,doors,make,model,mileage,yr,price);
        this.cargoSpace=cargoSpace;
    }
    @Override
    public String toString() {
        return super.toString()+" cargo space: "+cargoSpace;
    }
}