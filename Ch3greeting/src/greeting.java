import java.util.Scanner;

public class greeting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String yes = "yes";
		final String  no = "no";
		String again;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Hello, World!");
			System.out.println("Play again? (yes/no)");
			again = input.nextLine();
			
			while (again.equalsIgnoreCase(no) != true && again.equalsIgnoreCase(yes) != true) {
				System.out.println("Please enter \"yes\" or \"no\"");
				again = input.nextLine();
			}
		} while (again.equalsIgnoreCase(yes) == true);
		
		System.out.println("Terminating..!");
	}

}
