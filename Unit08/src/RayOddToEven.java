//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstOdd = -1;
		for(int i = 0; i< ray.length-1; i++) {
			if (ray[i]% 2 != 0 && firstOdd == -1)
			{
				firstOdd = i;
			}
			if(firstOdd != -1 && ray[i]%2 == 0)
			{
				return i-firstOdd;
			}
		}
		return -1;
	}
}