import java.util.Scanner;
import java.lang.String;

public class displayBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Initialize variables
		Scanner input = new Scanner(System.in);
		int height, width;
		String  yes, no, answer;
		String symbol;
		yes = "yes";
		no = "no";
		
		//Get values for variables
		System.out.println("What is the length of the rectangle: ");
		height = input.nextInt();
		System.out.println("What is the width of the rectangle: ");
		width = input.nextInt();
		System.out.println("Would you like to use a custom symbol? (yes or no): ");
		answer = input.nextLine();
		
		while (answer.compareTo(yes) != 0 && answer.compareTo(no) != 0) {
			System.out.println("Please enter either \"yes\" or \"no\": ");
			answer = input.nextLine();
		}
		
		if (0 == answer.compareToIgnoreCase(yes)) {
			System.out.println("What symbol would you like to use: ");
			symbol = input.nextLine();
			drawBox(height, width, symbol);
		} else if (0 == answer.compareToIgnoreCase(no)) {
			drawBox(height, width);
		}
	}

	public static void drawBox(int height, int width) {
		String symbol = "*";
		for (int i = 1, i <= height, i++) {
			drawBar(width, symbol);
		}
	}


	public static void drawBox(int height, int width, String symbol) {
		// TODO Auto-generated method stub
		
	}

	private static void drawBar(int width) {
		// TODO Auto-generated method stub
		
	}
}
