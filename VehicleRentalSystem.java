package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private List<Vehicle> inventory;
    public VehicleRentalSystem() {
    	this.inventory=new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
    	inventory.add(vehicle);
    }
    public void displayAvailableVehicles() {
    	System.out.println("Available Vehicles:");
    	for(Vehicle vehicle:inventory) {
    		if(vehicle.isAvailable()) {
    			System.out.println("ID: "+vehicle.getId()+", Mileage: "+vehicle.getMileage());
    		}
    	}
    }
    public void rentVehicle(String id,int days) {
    	for(Vehicle vehicle: inventory) {
    		if(vehicle.getId().equals(id) && vehicle.isAvailable()) {
    			vehicle.setAvailable(false);
    			System.out.println("Vehicle "+id + " rented for "+days+" days. Total cost: $"+vehicle.getRentalCost(days));
    			return;
    		}
    	}
    	System.out.println("Vehicle not available or not found.");
    }
    public void returnVehicle(String id) {
    	for(Vehicle vehicle: inventory) {
    		if(vehicle.getId().equals(id) && !vehicle.isAvailable()) {
    			vehicle.setAvailable(true);
    			System.out.println("Vehicle "+id + " returned.");
    			return;
    		}
    	}
    	System.out.println("Vehicle  not found or already returned.");
    }
    public void searchVehicleByMileage(double minMileage,double maxMileage) {
    	System.out.println("Vehicle within mileage range: ");
    	for(Vehicle vehicle:inventory) {
    		if(vehicle.getMileage()>=minMileage && vehicle.getMileage()<=maxMileage) {
    			System.out.println("Id: "+vehicle.getId()+", Mileage: "+vehicle.getMileage());
    		}
    	}
    }
    
	public void calculateTotalEarnings() {
		// TODO Auto-generated method stub
		double totalEarnings=0;
    	for(Vehicle vehicle: inventory) {
    		if(!vehicle.isAvailable()) {
    			totalEarnings+=vehicle.getRentalCost(1);
    		}
    	}
    	System.out.println("Total Earnings: $"+totalEarnings);
	}
	
}