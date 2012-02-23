import java.util.Scanner;

public class ch3ExOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int exercise;
		Scanner input = new Scanner(System.in);
		
		//Determine which exercise to run
		System.out.println("Which exercise would you like to run?");
		exercise = input.nextInt();
		
		/*while (exercise != 1 || 3 || 5 || 7) {
			System.out.println("That is not a valid number. \n" +
					"Please enter an odd number from 1 to 7");
			exercise = input.nextInt();
		}
		*/
	
		//Run the determined exercise
		switch (exercise) {
		
		case 1:
			System.out.format("%10s %10s %10s %10s %10s", "B", "I", "N", "G", "O\n");
			System.out.format("%10s %10s %10s %10s %10s", "2", "20", "42", "60", "64\n");
			System.out.format("%10s %10s %10s %10s %10s", "14", "25", "32", "55", "70\n");
			System.out.format("%10s %10s %10s %10s %10s", "5", "18", "FREE", "53", "67\n");
			System.out.format("%10s %10s %10s %10s %10s", "12", "16", "31", "46", "75\n");
			System.out.format("%10s %10s %10s %10s %10s", "10", "22", "39", "59", "71\n");
			break;
		
		case 3:
			System.out.println("***************");
			System.out.format("%1s %14s", "*", "*\n");
			System.out.format("%1s %14s", "*", "*\n");
			System.out.format("%1s %14s", "*", "*\n");
			System.out.format("%1s %14s", "*", "*\n");
			System.out.format("%1s %14s", "*", "*\n");
			System.out.println("***************");
			break;
		
		case 5:
			System.out.format("%6s %6s", "|", "|\n");
			System.out.format("%6s %6s", "|", "|\n");
			System.out.format("%6s %6s", "|", "|\n");
			System.out.print("--------------------\n");
			System.out.format("%6s %6s", "|", "|\n");
			System.out.format("%6s %2s %3s", "|", "X", "|\n");
			System.out.format("%6s %6s", "|", "|\n");
			System.out.print("--------------------\n");
			System.out.format("%6s %6s", "|", "|\n");
			System.out.format("%6s %6s", "|", "|\n");
			System.out.format("%6s %6s", "|", "|\n");
			break;
		
		case 7:
			System.out.format("%10s", "*****\n");
			System.out.format("%4s %9s", "*", "*\n");
			System.out.format("%3s %10s", "*", "*\n");
			System.out.format("%2s %11s", "*", "*\n");
			System.out.format("%1s %12s", "*", "*\n");
			System.out.format("%1s %12s", "*", "*\n");
			System.out.format("%2s %11s", "*", "*\n");
			System.out.format("%3s %10s", "*", "*\n");
			System.out.format("%4s %9s", "*", "*\n");
			System.out.format("%10s", "*****\n");
			break;
		}
		
		

	}

}
