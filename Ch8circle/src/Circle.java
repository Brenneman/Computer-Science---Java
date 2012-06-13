/**
 * Circle Class
 * @author student
 *
 */
public class Circle {
private static final double PI = 3.14;
private double radius;

/**
 * constructor
 * pre: none
 * post: A circle object created. Radius initialized to 1.
 */
public Circle() {
	radius = 12;	//default radius
}

/**
 * Changes the radius of the circle.
 * pre: none
 * post: Radius has been changed
 * @param newRadius - Sets the radius
 */
public void setRadius(double newRadius) {
	radius = newRadius;
}

/**
 * Calculates the area of the circle
 * pre: none
 * post: The area of the circle has been returned
 */
public double area() {
	double circleArea;
	
	circleArea = PI * radius * radius;
	return(circleArea);
}

/**
 * Calculates the circumference of the circle
 * pre: none
 * post: The circumference of the circle has been returned.
 */
public double circumference() {
	double circleCircumference;
	
	circleCircumference = 2 * PI * radius;
	return(circleCircumference);
}

/**
 * Returns the radius of the circle.
 * pre: none
 * post: The radius of the circle has been returned.
 */
public double getRadius() { 
	return(radius);
}
}
