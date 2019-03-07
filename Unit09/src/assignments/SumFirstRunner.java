package assignments;

import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		ListSumFirst list = new ListSumFirst();
		int[] allnum = new int[] {-99,1,2,3,4,5,6,7,8,9,10,5};
		for(int i = 0; i<allnum.length;i++) {
			num.add(i, allnum[i]);
		}
		System.out.println(list.go(num));
		allnum = new int[] {10,9,8,7,6,5,4,3,2,1,-99};
		for(int i = 0; i<allnum.length;i++) {
			num.add(i, allnum[i]);
		}
		System.out.println(list.go(num));
		allnum = new int[] {10,20,30,40,50,-11818,40,30,20,10};
		for(int i = 0; i<allnum.length;i++) {
			num.add(i, allnum[i]);
		}
		System.out.println(list.go(num));
		allnum = new int[] {32767};
		for(int i = 0; i<allnum.length;i++) {
			num.add(i, allnum[i]);
		}
		System.out.println(list.go(num));
	}
}