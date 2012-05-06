import java.util.Scanner;

/*
 * Chapter 4 Test Payroll
 * Tristan Brenneman
 * April 5, 2012
 */
public class Payroll {

	public static void main(String[] args) {
		//Initialize variables
		Scanner input = new Scanner(System.in);
		double pay, tax, netpay;
		
		//Get the pay and tax rate
		System.out.println("Enter the Gross Pay: ");
		pay = input.nextDouble();
		System.out.println("Enter the tax rate: ");
		tax = input.nextDouble();
		
		//Do the math
		netpay = pay - (pay * tax);
		
		//Display the output
		System.out.println("Net Pay: $" + netpay);

	}

}
