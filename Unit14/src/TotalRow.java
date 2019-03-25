//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> total = new ArrayList<Integer>();
    	int sum = 0;
    	for(int k[] : m) {
    		for(int i : k) {
    			sum+= i;
    		}
    		total.add(sum);
    		sum = 0;
    	}
    	//add code here
		return total;
    }
}
