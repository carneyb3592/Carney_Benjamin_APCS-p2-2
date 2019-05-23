/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testKeepOnlyBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	public static void testNegate() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}

	public static void testGrayscale() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}

	public static void testFixUnderwater() {
		Picture beach = new Picture("water.jpg");
		beach.explore();
		beach.fixUnderwater();
		beach.explore();
	}

	public static void testMirrorVerticalRightToLeft() {
		Picture motor = new Picture("redMotorcycle.jpg");
		motor.explore();
		motor.mirrorVerticalRightToLeft();
		motor.explore();
	}

	public static void testMirrorHorizontal() {
		Picture motor = new Picture("redMotorcycle.jpg");
		motor.explore();
		motor.mirrorHorizontal();
		motor.explore();
	}

	public static void testMirrorHorizontalBotToTop() {
		Picture beach = new Picture("redMotorcycle.jpg");
		beach.explore();
		beach.mirrorHorizontalBotToTop();
		beach.explore();
	}

	public static void testMirrorDiagonal() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorDiagonal();
		beach.explore();
	}

	public static void testMirrorArms() {
		Picture snow = new Picture("snowman.jpg");
		snow.explore();
		snow.mirrorArms();
		snow.explore();
	}

	public static void testMirrorGull() {
		Picture snow = new Picture("seagull.jpg");
		snow.explore();
		snow.mirrorGull();
		snow.explore();
	}

	public static void testCopy() {
		Picture flower2 = new Picture("640x480.jpg");
		Picture flower = new Picture("beach.jpg");
		flower.explore();
		flower2.copy(flower, 300, 350, 300, 350);
		flower2.explore();
	}

	public static void testMyCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.myCollage();
		canvas.explore();
	}

	public static void testKeepOnlyRed() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyRed();
		beach.explore();
	}

	public static void testKeepOnlyGreen() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyGreen();
		beach.explore();
	}

	public static void testEncodeAndDecode() {
		Picture beach = new Picture("beach.jpg");
		Picture msg = new Picture("msg.jpg");
		beach.explore();
		msg.explore();
		beach.encode(msg);
		beach.explore();
		beach = beach.decode();
		beach.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		testEncodeAndDecode();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorDiagonal();
		// testMirrorHorizontalBotToTop();
		// testMirrorVertical();
		// testMirrorVerticalRightToLeft();
		// testMirrorHorizontal();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testMyCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}