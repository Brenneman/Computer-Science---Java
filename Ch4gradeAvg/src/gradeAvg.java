import java.util.Scanner;


public class gradeAvg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int grade = 1;
		int sumofgrades = 0;
		double avg = 0;
		
		System.out.println("Please enter the first grade:");
		
		for (int count = 1; grade != 0; count++) {
			grade = input.nextInt();
			sumofgrades += grade;
			avg = (double)sumofgrades / (double)count;
			
			System.out.println("Please enter a grade (0 to quit):");
		}
		
		System.out.println("The avg of the grades is: " + avg + "%");
	}

}
