import java.util.Scanner;
public class distance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double raceSegment1;
		double raceSegment2;
		double raceSegment3;
		double distance;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the first segment of the race:");
		raceSegment1 = input.nextDouble();
		System.out.println("Enter the length of the second segment of the race:");
		raceSegment2 = input.nextDouble();
		System.out.println("Enter the length of the thrid segment of the race:");
		raceSegment3 = input.nextDouble();
		distance = raceSegment1 + raceSegment2 + raceSegment3;
		
		System.out.println("The full distance of the race was " + distance + "m");

	}

}
