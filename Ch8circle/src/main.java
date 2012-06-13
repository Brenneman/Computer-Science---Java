/**
 * 
 * @author Tristan Brenneman
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void circle(String[] args) {
		Circle spot = new Circle();
		
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference());
	}

}
