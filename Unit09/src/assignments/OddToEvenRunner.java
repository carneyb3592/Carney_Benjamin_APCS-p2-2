//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ben Carney
//Date -
package assignments;
import java.util.Arrays;
import java.util.List;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		List<Integer> ray = Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11);
		ListOddToEven x = new ListOddToEven();
		System.out.println(x.go(ray));
		List<Integer> ray2 = Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7);
		ListOddToEven x2 = new ListOddToEven();
		System.out.println(x2.go(ray2));
		List<Integer> ray3 = Arrays.asList(10,20,30,40,5,41,31,20,11,7);
		ListOddToEven x3 = new ListOddToEven();
		System.out.println(x3.go(ray3));
		List<Integer> ray4 = Arrays.asList(32767,70,4,5,6,7);
		ListOddToEven x4 = new ListOddToEven();
		System.out.println(x4.go(ray4));
		List<Integer> ray5 = Arrays.asList(2,7,11,21,5,7);
		ListOddToEven x5 = new ListOddToEven();
		System.out.println(x5.go(ray5));
		
	}
}