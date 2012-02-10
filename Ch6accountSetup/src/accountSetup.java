import java.util.Scanner;
import java.lang.String;




public class accountSetup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String username;
		String password;
		int passwordLength;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a username:");
		username = input.nextLine();
		
		do {
		System.out.println("Enter a password (8 char. minimum):");
		password = input.nextLine();
		passwordLength = password.length();
		} while (passwordLength < 8);
		
		System.out.println("Your username is " + username + " and your password is " + password);
	}
}
