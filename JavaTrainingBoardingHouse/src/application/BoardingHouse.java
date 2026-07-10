package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class BoardingHouse {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int rooms = 10;
		int nStudents = 0;
		
		System.out.print("How many rooms will be rented? Quantity: ");
		nStudents = sc.nextInt();
				
		Rent[] rents = new Rent[rooms];
		
		Rent rent = new Rent();
		
		for(int i = 0; i < nStudents; i++){
			
			System.out.printf("Rent# %d%n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			rent.setStudentName(sc.nextLine());
			System.out.print("Email: ");
			rent.setStudentEmail(sc.nextLine());
			System.out.print("Room: ");
			rent.setRoom(sc.nextInt());
			
			rent.setRentNumber(i+1);
			
			rents[rent.getRoom()] = new Rent(i, rent.getStudentName(), rent.getStudentEmail(), rent.getRoom());
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
			
		for( int i = 0; i <rents.length; i++) {
			
			if (rents[i] != null) {
			System.out.printf("%d: %s, %s%n", rents[i].getRoom(), rents[i].getStudentName(), rents[i].getStudentEmail());
			}
		}
		
		sc.close();
		
	}

}
