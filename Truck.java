package VehicleRentalSystem;

public class Truck extends Vehicle{
private double dailyRate;
private double mileage;
public Truck(String id,double dailyRate,double mileage) {
	super(id);
	this.dailyRate=dailyRate;
	this.mileage=mileage;
}
@Override
public double getRentalCost(int days) {
	   return days*dailyRate;
}
public double getMileage() {
	   return mileage;
}
}
