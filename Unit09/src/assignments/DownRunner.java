package assignments;
import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{							

		List<Integer> ray = Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345);
		ListDown x = new ListDown();
		System.out.println(x.go(ray));
		ray = Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99);
		System.out.println(x.go(ray));
		ray = Arrays.asList(10,20,30,40,50,-11818,40,30,20,10);
		System.out.println(x.go(ray));
		ray = Arrays.asList(32767);
		System.out.println(x.go(ray));
		ray = Arrays.asList(255,255);
		System.out.println(x.go(ray));
		
	}
}