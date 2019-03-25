//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] list = {{1,2,3},{5,5,5,5}};
		int[][] list2 = {{1,2,3},{5},{1},{2,2}};
		int[][] list3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		TotalRow t = new TotalRow();
		System.out.println("Row totals are :: " + t.getRowTotals(list));
		System.out.println("Row totals are :: " + t.getRowTotals(list2));
		System.out.println("Row totals are :: " + t.getRowTotals(list3));
		
		//add code here			
	}
}



