import java.util.Scanner;

/*
 * Chapter 4 Test Van
 * Tristan Brenneman
 * April 5, 2012
 */
public class Van {

	
	public static void main(String[] args) {
		//Initialize Variables
		Scanner input = new Scanner(System.in);
		int passengers, vans, left;
		
		//Get number of passengers
		System.out.println("Enter the number of passengers: ");
		passengers = input.nextInt();
		
		//Do Calculations
		vans = passengers / 10;
		left = passengers % 10;
		
		//Display the output
		System.out.println(vans + " Vans are required to transport the passengers.\n" + left + " Passenger(s) will be left behind.");

	}

}
