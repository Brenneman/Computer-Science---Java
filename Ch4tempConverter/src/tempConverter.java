import java.util.Scanner;


public class tempConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temp;
		double celsius;
		
		System.out.println("Please enter a temperature(F):");
		temp = input.nextDouble();
		
		celsius = ( 5.0 / 9.0 ) * ( temp - 32.0 );
		
		System.out.println("The temperature is: " + celsius + "C");

	}

}
