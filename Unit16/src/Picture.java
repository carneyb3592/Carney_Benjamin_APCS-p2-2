import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void keepOnlyRed() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void keepOnlyGreen() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setBlue(0);
			}
		}
	}

	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();

		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int gray = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed()) / 3;
				pixelObj.setRed(gray);
				pixelObj.setGreen(gray);
				pixelObj.setBlue(gray);
			}
		}
	}

	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();

		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(pixelObj.getRed() + 55);
				pixelObj.setBlue(pixelObj.getBlue() - 55);
				pixelObj.setGreen(pixelObj.getGreen() - 55);

			}
		}
	}

	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = width - 1; col > width / 2; col--) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels.length;
		for (int row = 0; row < pixels.length / 2; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[width - 1 - row][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorHorizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels.length;
		for (int row = pixels.length - 1; row > pixels.length / 2; row--) {
			for (int col = 0; col < pixels[0].length; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[width - 1 - row][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels.length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < row; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[col][row];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {
				count++;
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
		System.out.println(count);
	}

	public void mirrorArms() {
		int mirrorPoint = 194;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 163; row < mirrorPoint; row++) {

			for (int col = 103; col < 291; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorGull() {
		int mirrorPoint = 342;
		Pixel leftPixel = null;
		Pixel rightPixel = null;

		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 234; row < 321; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 239; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}

	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void copy(Picture fromPic, int startRow, int endRow, int startCol, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[toRow][toCol];
				toPixel = toPixels[fromRow][fromCol];
				toPixel.setColor(fromPixel.getColor());

			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	public void myCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		flower1.mirrorHorizontalBotToTop();
		Picture flower2 = new Picture("flower2.jpg");
		flower2.negate();
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel topPixel = null;

		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		Color topColor = null;
		for (int row = 0; row < pixels.length - 1; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				topPixel = pixels[row + 1][col];
				topColor = topPixel.getColor();
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else if (leftPixel.colorDistance(topColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public void encode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		int redLast;
		int blueLast;
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				// if the current pixel red is odd make it even
				currPixel = currPixels[row][col];
				redLast = currPixel.getRed()%10%10;
				blueLast = currPixel.getBlue()%10%10;
				
				if (blueLast != redLast) {
					int average = (int) Math.sqrt(((Math.pow(blueLast, 2) + Math.pow(redLast, 2))/2));
					currPixel.setBlue(currPixel.getBlue()-(blueLast-average));
					currPixel.setRed(currPixel.getRed()-(redLast-average));
					if(currPixel.getRed() == 255) {
						while(currPixel.getBlue()%10%10 != 5) {
							currPixel.setBlue(currPixel.getBlue()-1);
						}
					}
					if(currPixel.getBlue() == 255) {
						while(currPixel.getRed()%10%10 != 5) {
							currPixel.setRed(currPixel.getRed()-1);
						}
					}
				}
				
				messagePixel = messagePixels[row][col];
				if (Math.abs(messagePixel.colorDistance(Color.BLACK)) < 100) {
					if(currPixel.getBlue() == 255) {
						currPixel.setBlue(currPixel.getBlue() - 1);

					}
					else
						currPixel.setBlue(currPixel.getBlue() + 1);

					count++;
				}
			}
		}
		System.out.println(count);
	}

	
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;

		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = pixels[row][col];
				messagePixel = messagePixels[row][col];
				if (currPixel.getBlue()%10%10 != currPixel.getRed()%10%10) {
					messagePixel.setColor(Color.BLACK);
					count++;
				}
			}
		}
		System.out.println(count);
		return messagePicture;
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture snow = new Picture("seagull.jpg");
		snow.explore();
		snow.mirrorGull();
		snow.explore();
	}

} // this } is the end of class Picture, put all new methods before this
