/*
 * Coin Class
 * @Author Tristan Brenneman
 */
public class Coin {
	private int face;

	/*
	 * Constructor
	 * pre: none
	 * Post: A Coin object created. Initialized to heads.
	 */
	public Coin() {
		face = 0;		//Default face tails
	}
	
	public int showFace() {
		return face;
	}
	
	public void flipCoin() {
		face = (int)(Math.random() + 1);
	}
}
