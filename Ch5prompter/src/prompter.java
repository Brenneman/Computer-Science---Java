import java.util.Scanner;


public class prompter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int min;
		int max;
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the minimum:");
		min = input.nextInt();
		System.out.println("Please enter the maximum:");
		max = input.nextInt();
		System.out.println("Please enter a number between " + min + " and " + max);
		num = input.nextInt();
		
		while (num < min || num > max) {
			System.out.println("Sorry, that number is not within the range.");
			System.out.println("Please enter a number between " + min + " and " + max);
			num = input.nextInt();
		}
		
		System.out.println("Thank you!");

	}

}
