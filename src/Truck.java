public class Truck extends Vehicle{

    private double bedSpace;
    public Truck() {

    }
    public double getBedSpace() {
        return bedSpace;
    }
    public void setBedSpace(double bedSpace) {
        this.bedSpace = bedSpace;
    }
    public Truck(int mpg,String color,Engine engine,String vehicleID,int seats,int doors,String make,String model,int mileage,int yr,double price,double bedSpace) {
        super(mpg,color,engine,vehicleID,seats,doors,make,model,mileage,yr,price);
        this.bedSpace=bedSpace;
    }
    @Override
    public String toString() {
        return super.toString()+"\nBed Space: "+bedSpace+"\n";
    }
}
