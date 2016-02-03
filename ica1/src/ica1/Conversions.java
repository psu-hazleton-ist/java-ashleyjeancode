package ica1;

import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int selection = 5; 
		
		do {
			
			System.out.println("Make A Selection:\n1. Kilometer\n2.Meters\n3.Inches\n4.Feet\n5.Quit");
		selection = s.nextInt();
		
		switch(selection) {
			case 1:
				Convert distance = entermeters();
				System.out.println("Kilometers: " + distance.getKilometers());
				break;
			case 2:
				Convert distance2 = entermeters();
				System.out.println("Meters: " + distance2.getMeters());
				break;
			case 3:
				Convert distance3 = entermeters();
				System.out.println("Inches: " + distance3.getInches());
				break;
			case 4:
				Convert distance4 = entermeters();
				System.out.println("Feet: " + distance4.getFeet());
				break;
			default: 
				System.out.println("Quitting program.");
				selection = 5;
			
			
		
				
			}
		} while(selection != 5);
		
		
		
		
		
		
		
		
		
		s.close();
	}
	
	private static Convert entermeters() {
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter meters: ");
		double meters = s2.nextDouble();
		Convert distance = new Convert(meters);
		
		return distance;
	}

}
