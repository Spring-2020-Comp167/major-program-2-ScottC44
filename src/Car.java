public class Car extends Vehicle{
    private boolean convertible;

    public Car() {

    }
    public Car(int mpg,String color,Engine engine,String vehicleID,int seats,int doors,String make,String model,int mileage,int yr,double price,boolean convertible) {
        super(mpg,color,engine,vehicleID,seats,doors,make,model,mileage,yr,price);
        this.convertible=convertible;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    @Override
    public String toString() {
        return super.toString()+"\n convertible: "+convertible;
    }
}
