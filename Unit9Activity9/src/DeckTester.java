
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		/**String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.print(d);
		d.deal();
		d.deal();
		System.out.print(d);
		//52 Card deck
		*/
		String[] rank52 = {"King", "Queen", "Jack","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two","Ace"};
		String[] suits52 = {"Spades","Diamonds","Clubs","Hearts"};
		int[] pointValues52 = {13,12,11,10,9,8,7,6,5,4,3,2,1};
		Deck d2 = new Deck(rank52, suits52, pointValues52);
		System.out.print(d2);
		d2.shuffle();
		System.out.print(d2);
	}
}
