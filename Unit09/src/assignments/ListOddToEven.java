//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package assignments;
import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOdd = -1;
		int lastEven =-1;
		for(int i = 0; i< ray.size()-1; i++) {
			if (ray.get(i)% 2 != 0 && firstOdd == -1)
			{
				firstOdd = i;
				break;
			}
		}
		if(firstOdd != -1) {
			for(int i = ray.size()-1; i > 0; i--){
				if(ray.get(i)%2 == 0)
				{
					lastEven = i;
					break;
				}
			}
			
		}
		if(firstOdd==-1||(lastEven==-1)) {
			return-1;
		}
		
		return lastEven-firstOdd;
	}
}