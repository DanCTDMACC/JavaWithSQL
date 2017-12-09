package controller;

import java.util.Scanner;

public class CarService {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CarDao dao = new CarDao();
		int choice = 0;
		
		showMenu();
		choice = in.nextInt();
		while (choice != 9) {
			switch(choice) {
			case 1:
				dao.showAllCar();
				break;
			case 2:
				System.out.println("Manufacturer Name: ");
				String make = in.next();
				dao.findCarByManufacturer(make);
				break;
			case 3:
				System.out.println("Year: ");
				int year = in.nextInt();
				dao.findCarByYear(year);
				break;
			case 4:
				dao.showAllCarByManufacturer();
				break;
			case 5:
				dao.showAllCarByYear();
			default:
				System.out.println("Wrong option.");
				break;
			}
			
			showMenu();
			choice = in.nextInt();
		}
		System.out.println("End.");
	}
	
	private static void showMenu() {
		System.out.println();
		System.out.println("1. Show All Cars");
		System.out.println("2. Show Cars By A Manufacturer");
		System.out.println("3. Show Cars By A Year");
		System.out.println("4. Show Cars Sorted By Manufacturer");
		System.out.println("5. Show Cars Sorted By Year");
		System.out.println("9. Quit");
		System.out.print("Your choice: ");
	}

}
