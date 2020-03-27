public class MiniVan extends Vehicle{
    private boolean slidingDoors;
    public MiniVan() {

    }
    public MiniVan(int mpg,String color,Engine engine,String vehicleID,int seats,int doors,String make,String model,int mileage,int yr,double price,boolean slidingDoors) {
        super(mpg,color,engine,vehicleID,seats,doors,make,model,mileage,yr,price);
        this.slidingDoors=slidingDoors;
    }
    public boolean isSlidingDoors() {
        return slidingDoors;
    }
    public void setSlidingDoors(boolean slidingDoors) {
        this.slidingDoors = slidingDoors;
    }
    public String slide(){
        if(isSlidingDoors() ==true)
            return "Yes";
        else
            return "No";

    }
    @Override
    public String toString() {
        return super.toString()+"\nSliding doors: "+slidingDoors;
    }
}
