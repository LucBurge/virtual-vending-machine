package vending;
import java.util.Scanner;
public class vending {

	public static void main(String[] args) {
		// initialising variables
		int choice; 
		int gumTotal = 0;
		int chocTotal = 0; 
		int popTotal = 0;
		int juiceTotal = 0;
		
		// display greeting message and options available to user
		System.out.println("Welcome to the Virtual Vending Machine!");
		System.out.println("[1] Gum \n[2] Chocolate \n[3] Popcorn \n[4] Juice \n[5] View total sales \n[6] Exit ");
		
		// do while loop to display message and count determined by user input
		do {
			
			// user input to select an option from 1-6
			System.out.println("Please select an option.");
			Scanner choose = new Scanner(System.in);
			choice = choose.nextInt();
			
			// message and counter for option 1
			if(choice == 1) {
				System.out.println("Here is your gum.");
				gumTotal++;
			}
			
			// message and counter for option 2
			else if(choice == 2) {
				System.out.println("Here is your chocolate.");
				chocTotal++;
			}
			
			// message and counter for option 3
			else if(choice == 3) {
				System.out.println("Here is your popcorn.");
				popTotal++;
			}
			
			// message and counter for option 4
			else if(choice == 4) {
				System.out.println("Here is your juice.");
				juiceTotal++;
			}
			
			// displays total amount of each product sold
			else if(choice == 5) {
				System.out.println("Total sales so far: ");
				System.out.println("Items of gum sold = " + gumTotal);
				System.out.println("Items of chocolate sold = " + chocTotal);
				System.out.println("Items of popcorn sold = " + popTotal);
				System.out.println("Items of juice sold = " + juiceTotal);
			}
			
			// displays message and terminates do while loop
			else if(choice == 6) {
				System.out.println("Exit. Goodbye.");
			}
			
			// user input error message
			else {
				System.out.println("Error. Please choose a number from 1-6.");
			}
		
		// do while loop termiates if option 6 is selected
		} while(choice != 6);
		
	}

}

