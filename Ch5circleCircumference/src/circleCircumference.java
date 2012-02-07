import java.util.Scanner;


public class circleCircumference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double PI = 3.14;
		double radius;
		double circumference;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle:");
		radius = input.nextDouble();
		
		if (radius < 0) {
			System.out.println("Negative radii are illegal! \nYOU FAIL!");
		} else {
		
		circumference = 2 * PI * radius;
		System.out.println("The circumference of the circle is: " + circumference);
		}

	}

}
