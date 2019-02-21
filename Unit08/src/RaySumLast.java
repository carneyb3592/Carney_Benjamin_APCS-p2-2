//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int biggest = ray[ray.length-1];
		int sum = 0;
		for(int i = 0; i<ray.length;i++)
		{
			if (ray[i] > biggest)
			{
				sum+= ray[i];
			}
		}
		
		if (sum == 0)
			{
			return -1;
			}
		return sum;
	}
}