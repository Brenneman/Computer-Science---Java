import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tristan
 *
 */
public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int originalNum;
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of the factorial:");
		num = input.nextInt();
		originalNum = num;
		
		for (int count = num - 1; count != 0; count--) {
		num *= count;
		}
		
		System.out.println("The factorial of " + originalNum + " is " + num);
		
	}

}
