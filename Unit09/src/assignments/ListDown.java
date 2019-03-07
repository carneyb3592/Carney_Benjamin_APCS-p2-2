//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package assignments;
import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		int start = numArray.get(0);
		int count = 0;
		if (numArray.size() == 1)
		{
			return true;
		}
		for(int i = 1; i < numArray.size()-1;i++)
		{
			
			if (start > numArray.get(i))
			{
				start = numArray.get(i);
				return true;
	
			}
			else
			{
				return false;
			}
		}
		
		
		return false;
	}	
}