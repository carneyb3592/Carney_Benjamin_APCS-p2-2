//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int start = numArray[0];
		int count = 0;
		if (numArray.length ==1)
		{
			return true;
		}
		for(int i = 1; i < numArray.length-1;i++)
		{
			
			if (start > numArray[i])
			{
				start = numArray[i];
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