
package VehicleRentalSystem;

import java.util.Scanner;

public class VehicleManagementSystem {
@SuppressWarnings("resource")
public static void main(String args[]) {
	VehicleRentalSystem rentalSystem=new VehicleRentalSystem();
	Vehicle car=new Car("C001",50,25);
	Vehicle truck=new Truck("T001",100,15);
	Vehicle motorcycle=new Motorcycle("M001",30,50);
	rentalSystem.addVehicle(car);
	rentalSystem.addVehicle(truck);
	rentalSystem.addVehicle(motorcycle);
	Scanner scanner=new Scanner(System.in);
	while(true) {
		System.out.println("\nVehicle Rental System Options:");
        System.out.println("1. Display Available Vehicles");
        System.out.println("2. Rent a Vehicle");
        System.out.println("3. Return a Vehicle");
        System.out.println("4. Search Vehicle by Mileage");
        System.out.println("5. Calculate Total Earnings");
        System.out.println("6. Exit");
        int choice=scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
        case 1:
        	rentalSystem.displayAvailableVehicles();
        	break;
        case 2:
        	System.out.println("Enter Vehicle Id to rent:");
        	String rentId=scanner.nextLine();
        	System.out.println("Enter number off days: ");
        	int days=scanner.nextInt();
        	rentalSystem.rentVehicle(rentId,days);
        	break;
        case 3:
        	System.out.println("Enter Vehicle Id to return:");
        	String returnId=scanner.nextLine();
        	rentalSystem.returnVehicle(returnId);
        	break;
        case 4:
        	 System.out.print("Enter minimum mileage: ");
             double minMileage=scanner.nextDouble();
             System.out.print("Enter maximum mileage");
             double maxMileage=scanner.nextDouble();
             rentalSystem.searchVehicleByMileage(minMileage, maxMileage);
        	break;
        case 5:
        	rentalSystem.calculateTotalEarnings();
        	break;
        case 6:
        	 System.out.println("Exiting system. Goodbye!");
        	return;
        default:
        	System.out.println("Invalid choice. please try again. ");
        }
	}
}

}