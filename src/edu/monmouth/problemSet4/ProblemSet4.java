package edu.monmouth.problemSet4;
import java.util.Arrays;

import edu.monmouth.campusvehicle.*;

public class ProblemSet4 {
	public static void main(String[] args) {
		// declare an array of references to CampusVehicles
		// allocate memory to store 10 references to CampusVehicles
		CampusVehicle vehicleArray[] = new CampusVehicle[CampusVehicleConstants.ARRAY_SIZE];
		
		// Constructing the 10 CampusVehicle objects 
		CampusVehicle campusVehicle1 = new CampusVehicle("mu1001ub", "University Bluffs", true, Color.BLACK);
		CampusVehicle campusVehicle2 = new CampusVehicle("mu1001lib", "Library", true, Color.GREEN);
		CampusVehicle campusVehicle3 = new CampusVehicle("mu1001pl", "Parking Lot", true, Color.BLUE);
		CampusVehicle campusVehicle4 = new CampusVehicle("mu1001lh", "Laurel Hall", true, Color.WHITE);
		CampusVehicle campusVehicle5 = new CampusVehicle("mu1001sh", "Spruce Hall", true, Color.BLACK);
		CampusVehicle campusVehicle6 = new CampusVehicle("mu1002lib", "Library", true, Color.YELLOW);
		CampusVehicle campusVehicle7 = new CampusVehicle("mu1002pl", "Parking Lot", true, Color.BLACK);
		CampusVehicle campusVehicle8 = new CampusVehicle("mu1002sh", "Spruce Hall", true, Color.BLUE);
		CampusVehicle campusVehicle9 = new CampusVehicle("mu101", "University Bluffs", true, Color.BLACK);
		CampusVehicle campusVehicle10 = new CampusVehicle("mu1003pl", "Campus Police", true, Color.BLACK);
		
		// populate the array with the above CampusVehicles
		vehicleArray[0] = campusVehicle1;
		vehicleArray[1] = campusVehicle2;
		vehicleArray[2] = campusVehicle3;
		vehicleArray[3] = campusVehicle4;
		vehicleArray[4] = campusVehicle5;
		vehicleArray[5] = campusVehicle6;
		vehicleArray[6] = campusVehicle7;
		vehicleArray[7] = campusVehicle8;
		vehicleArray[8] = campusVehicle9;
		vehicleArray[9] = campusVehicle10;
		
		
		// using a looping construct print each CampusVehicles attributes
		System.out.println("Vehicles in vehicleArray: \n");
		for (int i = 0, vehicleNumber = 1; i < vehicleArray.length; i++, vehicleNumber++) {
			System.out.println("Vehicle " + vehicleNumber + ":");
			System.out.println("ID: " + vehicleArray[i].getId());
			System.out.println("Location: " + vehicleArray[i].getLocation());
			System.out.println("Vehicle is available: " + vehicleArray[i].isAvailable());
			System.out.println("Color: " + vehicleArray[i].getColor());
			System.out.println();
		}
		
		// using a looping construct print each CampusVehicles attributes for those at Library
		System.out.println("Vehicles at Library:\n");
		
		for (int i = 0, vehicleNumber = 1; i < vehicleArray.length; i++, vehicleNumber++) {
			if (vehicleArray[i].getLocation().equals("library")) {
				
				System.out.println("Vehicle " + vehicleNumber + ":");
				System.out.println("ID: " + vehicleArray[i].getId());
				System.out.println("Location: " + vehicleArray[i].getLocation());
				System.out.println("Vehicle is available: " + vehicleArray[i].isAvailable());
				System.out.println("Color: " + vehicleArray[i].getColor());
				System.out.println();
			}
		}
		
		// set any 4 CampusVehicle's in the array to a false availability
		campusVehicle1.setAvailable(false);
		campusVehicle3.setAvailable(false);
		campusVehicle4.setAvailable(false);
		campusVehicle10.setAvailable(false);
		
		// using a looping construct print each CampusVehicles attributes which are available
		System.out.println("Vehicles that are available\n");
		for (int i = 0, vehicleNumber = 1; i < vehicleArray.length; i++, vehicleNumber++) {
			if (vehicleArray[i].isAvailable() == true) {
				System.out.println("Vehicle " + vehicleNumber + ":");
				System.out.println("ID: " + vehicleArray[i].getId());
				System.out.println("Location: " + vehicleArray[i].getLocation());
				System.out.println("Vehicle is available: " + vehicleArray[i].isAvailable());
				System.out.println("Color: " + vehicleArray[i].getColor());
				System.out.println();
			}
		}
		
		// using a looping construct print each CampusVehicles attributes at University Bluffs
		System.out.println("Vehicles at University Bluffs:\n");
		
		for (int i = 0, vehicleNumber = 1; i < vehicleArray.length; i++, vehicleNumber++) {
			if (vehicleArray[i].getLocation().equals("university bluffs")) {
				
				System.out.println("Vehicle " + vehicleNumber + ":");
				System.out.println("ID: " + vehicleArray[i].getId());
				System.out.println("Location: " + vehicleArray[i].getLocation());
				System.out.println("Vehicle is available: " + vehicleArray[i].isAvailable());
				System.out.println("Color: " + vehicleArray[i].getColor());
				System.out.println();
			}
		}
		
		// create another  array of references to CampusVehicles named universityBluffsVehicles
		// allocate memory to store the number of CampusVehicles at University Bluffs (count them)
		// populate the array with CampusVehicles at University Bluffs
		
		CampusVehicle universityBluffsVehicles[] = new CampusVehicle[CampusVehicleConstants.BLUFF_ARRAY_SIZE];
		for (int i = 0, index = 0; i < vehicleArray.length; i++) {
			if (vehicleArray[i].getLocation().equals("university bluffs")) {
				universityBluffsVehicles[index] = vehicleArray[i];
				index++;
			}
		}
		
		// using a looping construct, print all attributes of elements in the universityBluffsVehicles array
		// Setting the vehicleNumber to 9 to match the value from the other array
		
		System.out.println("\nVehicles in the universityBluffsVehicle array: \n");
		for (int i = 0, vehicleNumber = 1; i < universityBluffsVehicles.length; i++, vehicleNumber = 9) {
			System.out.println("Vehicle " + vehicleNumber + ":");
			System.out.println("ID: " + universityBluffsVehicles[i].getId());
			System.out.println("Location: " + universityBluffsVehicles[i].getLocation());
			System.out.println("Vehicle is available: " + universityBluffsVehicles[i].isAvailable());
			System.out.println("Color: " + universityBluffsVehicles[i].getColor());
			System.out.println();
		}
		
		// using an attribute of the array, print the number of elements in universityBluffsVehicles
		System.out.println("Number of elements in the universityBluffsVehicles array: ");
		System.out.println(universityBluffsVehicles.length);
	
		// declare an array of references to CampusVehicles with a size of 5 named initArray
		CampusVehicle initArray[] = new CampusVehicle[CampusVehicleConstants.INIT_ARRAY_SIZE];
		CampusVehicle initializeVehicle = new CampusVehicle();
		
		// using the initializeVehicle object and the Arrays.fill method, populate this array
		Arrays.fill(initArray, initializeVehicle);
		
		// using a looping construct, print all attributes of elements in the initArray array
		System.out.println("\nVehicles in the initArray: \n");
		for (int i = 0, vehicleNumber = 1; i < initArray.length; i++, vehicleNumber++) {
			System.out.println("Vehicle " + vehicleNumber + ":");
			System.out.println("ID: " + initArray[i].getId());
			System.out.println("Location: " + initArray[i].getLocation());
			System.out.println("Vehicle is available: " + initArray[i].isAvailable());
			System.out.println("Color: " + initArray[i].getColor());
			System.out.println();
		}

	}

}
