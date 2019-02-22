/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c = new Card("King", "Hearts", 13);
		Card c2 = new Card("Queen", "Spades", 12);
		Card c3 = new Card("King", "Hearts", 13);
		System.out.println(c + "" + c2 + "" + c3 + "\n");
		System.out.println(c.matches(c2));
		System.out.println(c.matches(c3));
	}
}
