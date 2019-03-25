import java.util.Random;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		Random random = new Random();
		grid = new String[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				grid [i][j] = vals[random.nextInt(vals.length)];
			}
		}
		findMax(vals);
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		String maxString = "";
		for(String i : vals) {
			if (countVals(i) > max) {
				max = countVals(i);
				maxString = i;
			}
		}
		
		return maxString + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(String[] i : grid) {
			for(String y : i) {
				if(y == val) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output= "";
		for(int out = 0; out<grid.length; out++) {
			for(int in = 0; in<grid[out].length; in++) {
				output+= grid[out][in] + " ";
			}
			output+= "\n";
		}
		return output;
	}
}