import java.util.Scanner;


public class digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int digit1;
		int digit2;
		
		System.out.println("Please enter a two digit number");
		number = input.nextInt();
		
		digit1 = number % 10;
		digit2 = number / 10;
		
		System.out.println("The digits are " + digit2 + " and " + digit1);
		

	}

}
