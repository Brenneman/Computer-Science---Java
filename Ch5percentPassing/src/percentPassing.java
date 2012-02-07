import java.util.Scanner;


public class percentPassing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double newPercent;
		double sumPercent = 0;
		int count = 0;
		double avg;
		final int QUIT = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first test score (" + QUIT + " to quit):");
		newPercent = input.nextDouble();
		
		while (newPercent != QUIT) {
			if (newPercent >= 70) {
				sumPercent += newPercent;
				count += 1;
			}
			
			System.out.println("Please enter the first test score (" + QUIT + " to quit):");
			newPercent = input.nextDouble();
		}
		
		input.close();
		avg = sumPercent / count;
		System.out.println("The average of the tests above 70% is: " + avg + "%");
	}

}
