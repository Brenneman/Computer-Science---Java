import java.util.Scanner;

/*
 * Chapter 7 Time Converter Pg. 160
 * Tristan Brenneman
 * April 5, 2012
 */
public class timeConverter {


	
	//Hours to Minutes
	public static void hoursToMinutes() {
		//Initialise variables
		Scanner input = new Scanner(System.in);
		double hours, minutes;
		
		//Get value for hours
		System.out.println("Enter the amount of time in hours: ");
		hours = input.nextDouble();
		input.close();
		
		//Do the calculations
		minutes = hours * 60;
		
		//Display the output
		System.out.println(hours + " hours is " + minutes + " minutes");
	}
	
	//Days to Hours
	public static void daysToHours() {
		//Initialise variables
		Scanner input = new Scanner(System.in);
		double days, hours;
		
		//Get value for days
		System.out.println("Enter the amount of time in days: ");
		days = input.nextDouble();
		input.close();
		
		//Do the calculations
		hours = days * 24;
		
		//Display the output
		System.out.println(days + "Days is " + hours + " Hours");
	}
	
	//Minutes to Hours
	public static void minutesToHours() {
		//Initialise variables
		Scanner input = new Scanner(System.in);
		double minutes, hours;
		
		//Get value for minutes
		System.out.println("Enter the amount of time in minutes: ");
		minutes = input.nextDouble();
		input.close();
		
		//Do the calculations
		hours = minutes / 60;
		
		//Display the output
		System.out.println(minutes + "Minutes is " + hours + " Hours");
	}
	
	//Hours to Days
	public static void hoursToDays() {

		//Initialise variables
		Scanner input = new Scanner(System.in);
		double hours, days;
		
		//Get value for hours
		System.out.println("Enter the amount of time in hours");
		hours = input.nextDouble();
		input.close();
		
		//Do the calculations
		days = hours / 24;
		
		//Display the output
		System.out.println(hours + " Hours is " + days + " Days");
	}
	
	//Main
	public static void main(String[] args) {
		
		//Initialise variables
		Scanner input = new Scanner(System.in);
		int choice;
		
		//Get calculation choice
		System.out.println("1. Hours to Minutes\n" +
				"2. Days to Hours\n" +
				"3. Minutes to Hours\n" +
				"4. Hours to Days");
		System.out.println("Which type of conversion is to be preformed? ");
		choice = input.nextInt();
		
		//Decide which method to use
		switch (choice) {
			case 1:
				hoursToMinutes();
				break;
			case 2:
				daysToHours();
				break;
			case 3:
				minutesToHours();
				break;
			case 4:
				hoursToDays();
				break;
		}
	}

}
